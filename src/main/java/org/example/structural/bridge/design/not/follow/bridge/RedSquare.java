package org.example.structural.bridge.design.not.follow.bridge;


// now we want to introduce colors to the shape
public class RedSquare extends Shape{
    @Override
    void doSomething() {
        System.out.println("red square here");
    }


}


// similary we want to produce classes like BlueSquare, RedCircle, BlueCircle
// this will lead to a explosion of classes whenever a shape/color is added