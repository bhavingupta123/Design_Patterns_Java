package org.example.creational.prototype.design.example2_shallow_copy;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        NetworkLargeObject networkLargeObject = new NetworkLargeObject();
        networkLargeObject.loadLargeData();
        networkLargeObject.setIp("123.11");

        NetworkLargeObject networkLargeObject1 = (NetworkLargeObject) networkLargeObject.clone(); // shallow clone
        NetworkLargeObject networkLargeObject2 = (NetworkLargeObject) networkLargeObject.clone(); // shallow clone

        System.out.println(networkLargeObject1.getData());
        System.out.println("=======================================");
        System.out.println(networkLargeObject2.getData());
        System.out.println("=======================================");

        System.out.println(networkLargeObject == networkLargeObject1); // shallow copy, hence true
        System.out.println(networkLargeObject == networkLargeObject2); // shallow copy, hence true


    }
}
