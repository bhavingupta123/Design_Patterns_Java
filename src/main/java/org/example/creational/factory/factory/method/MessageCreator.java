package org.example.creational.factory.factory.method;

public abstract class MessageCreator {

    public Message getMessage(){
        Message msg = createMessge();

        msg.addDefaultHeader();
        msg.encrypt();

        return msg;
    }

    public abstract Message createMessge();


}
