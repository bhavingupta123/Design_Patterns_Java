package org.example.creational.singleton.design.lazy.with.sync;

import org.example.creational.singleton.design.lazy.with.sync.Bike;

public class Main {

    public static void main(String[] args) {
        Bike bike = Bike.getInstance();
        Bike bike2 = Bike.getInstance();

        System.out.println(bike==bike2); // both point to same object
    }
}
