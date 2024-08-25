package org.example.creational.factory.factory.method;

public class Main {

    public static void main(String[] args) {
        Message msg = new JSONMessageCreator().createMessge();
        System.out.println(msg.getContent());
    }
}
