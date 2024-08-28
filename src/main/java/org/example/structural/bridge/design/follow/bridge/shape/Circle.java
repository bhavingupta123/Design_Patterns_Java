package org.example.structural.bridge.design.follow.bridge.shape;

import org.example.structural.bridge.design.follow.bridge.color.Color;

public class Circle extends Shape{

    Color color;

    public Circle(Color color){
        super(color);
        this.color = color;
    }

    @Override
    public void doSomething() {
        System.out.println("circle");
        color.applyColor();
    }
}
