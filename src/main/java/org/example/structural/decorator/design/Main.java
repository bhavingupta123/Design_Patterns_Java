package org.example.structural.decorator.design;

import org.example.structural.decorator.design.decorators.HtmlEncodedMessage;

public class Main {

    public static void main(String[] args) {
        Message m = new TextMessage("hello");
        System.out.println(m.getContent());

        Message m2 = new HtmlEncodedMessage(m);
        System.out.println(m2.getContent());
    }
}
