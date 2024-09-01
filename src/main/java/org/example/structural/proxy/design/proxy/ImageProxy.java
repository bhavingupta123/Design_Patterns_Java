package org.example.structural.proxy.design.proxy;

import org.example.structural.proxy.design.Image;
import org.example.structural.proxy.design.ImageCreator;

public class ImageProxy implements Image {

    private String url;
    private ImageCreator imageCreator;

    public ImageProxy(String url){
        this.url = url;
    }

    @Override
    public void getImage() {

        if(this.imageCreator == null){
            imageCreator = new ImageCreator(url); // this is an expensive operation, so only do it when required
        }

        imageCreator.getImage();
    }
}
