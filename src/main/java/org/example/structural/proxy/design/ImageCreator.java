package org.example.structural.proxy.design;

public class ImageCreator implements Image{

    private String url;

    public ImageCreator(String url){
        this.url = url; // assume this is an expensive operation and takes a lot of time
    }

    @Override
    public void getImage() {
        // this is called very rarely

        // so instead of creating image before itself, we can create it when the getImage is called
        System.out.println("returns image : " + url);
    }
}
