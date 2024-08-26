package org.example.creational.singleton.design.eager;

public class Main {

    public static void main(String[] args) {
        Car car = Car.getInstance();
        Car car2 = Car.getInstance();

        System.out.println(car2 == car); // both point to same object
    }
}
