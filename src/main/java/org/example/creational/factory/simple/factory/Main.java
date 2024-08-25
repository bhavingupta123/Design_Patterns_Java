package org.example.creational.factory.simple.factory;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
        Vechile car = VechileFactory.createVechile("car");
        System.out.println(car);

        // java.text.NumberFormat - private static NumberFormat getInstance


    }
}
