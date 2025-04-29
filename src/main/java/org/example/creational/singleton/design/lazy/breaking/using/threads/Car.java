package org.example.creational.singleton.design.lazy.breaking.using.threads;

public class Car {

    private static Car instance;

    private Car(){

        System.out.println("new object is called");
    }

    public static Car getInstance(){

        if(instance==null){
            instance = new Car();
        }

        return instance;
    }
}
