package org.example.creational.singleton.design.eager;

public class Car {

    private static final Car INSTANCE = new Car();

    private Car(){

    }

    public static Car getInstance(){
        return INSTANCE;
    }


}
