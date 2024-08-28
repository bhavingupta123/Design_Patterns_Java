package org.example.structural.bridge.design.follow.bridge.shape;

import org.example.structural.bridge.design.follow.bridge.color.Color;

public class Square extends Shape {

    public Square(Color color){
        super(color);
        this.color = color;
    }

    @Override
    public void doSomething() {
        System.out.println("square");
        color.applyColor();
    }
}
