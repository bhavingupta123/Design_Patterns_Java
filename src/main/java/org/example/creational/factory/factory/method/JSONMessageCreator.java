package org.example.creational.factory.factory.method;

public class JSONMessageCreator extends MessageCreator{
    @Override
    public Message createMessge() {
        return new JSONMessage();
    }
}
