package org.example.structural.bridge.design.follow.bridge.shape;

import org.example.structural.bridge.design.follow.bridge.color.Color;

public abstract class Shape {

    Color color;

    public Shape(Color color){
        this.color = color;
    }

    abstract public void doSomething();
}
