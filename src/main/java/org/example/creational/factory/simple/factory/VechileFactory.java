package org.example.creational.factory.simple.factory;

public class VechileFactory {

    public static Vechile createVechile(String type){

        switch (type){
            case "car":
                return new Car();
            case "bike" :
                return new Bike();
            default:
                throw new IllegalArgumentException("Type doesn't exist");
        }
    }

}
