package org.example.creational.factory.factory.method;

public class TextMessageCreator extends MessageCreator{

    @Override
    public Message createMessge() {
        return new TextMessage();
    }
}
