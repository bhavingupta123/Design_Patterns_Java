package org.example.structural.bridge.design.not.follow.bridge;

public class Main {

    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.doSomething();

        Shape shape2 = new RedSquare();
        shape2.doSomething();

        Shape shape3 = new Square();
        shape3.doSomething();
    }
}
