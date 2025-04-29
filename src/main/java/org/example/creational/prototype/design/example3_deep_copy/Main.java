package org.example.creational.prototype.design.example3_deep_copy;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        LargeObject largeObject = new LargeObject();
        largeObject.loadData();

        LargeObject largeObject1 = largeObject.clone();

        System.out.println(largeObject == largeObject1); // deep copy hence false

    }
}
