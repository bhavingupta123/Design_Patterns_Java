package org.example.structural.proxy.design;

import org.example.structural.proxy.design.proxy.ImageProxy;

public class Main {

    public static void main(String[] args) {
        Image image = new ImageProxy("image.jpg");
        image.getImage();
    }
}
