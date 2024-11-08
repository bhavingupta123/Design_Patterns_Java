package org.example.creational.factory.factory.method;

public class Main {

    public static void main(String[] args) {

        Message msg2 = new TextMessageCreator().getMessage();

        Message msg = new JSONMessageCreator().createMessge();
        System.out.println(msg.getContent());

        System.out.println("-------------------------------");

        System.out.println(msg2.getContent());
    }
}
