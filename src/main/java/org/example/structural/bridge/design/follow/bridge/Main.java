package org.example.structural.bridge.design.follow.bridge;

import org.example.structural.bridge.design.follow.bridge.color.Blue;
import org.example.structural.bridge.design.follow.bridge.color.Red;
import org.example.structural.bridge.design.follow.bridge.shape.Circle;
import org.example.structural.bridge.design.follow.bridge.shape.Shape;
import org.example.structural.bridge.design.follow.bridge.shape.Square;

public class Main {

    public static void main(String[] args) {
        Shape shape = new Circle(new Blue());
        shape.doSomething();

        System.out.println("**********************");

        Shape shape2 = new Circle(new Red());
        shape2.doSomething();

        System.out.println("**********************");

        Shape shape3 = new Square(new Red());
        shape3.doSomething();

        System.out.println("**********************");
    }
}
