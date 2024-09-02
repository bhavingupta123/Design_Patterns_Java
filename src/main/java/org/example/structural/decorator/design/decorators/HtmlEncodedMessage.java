package org.example.structural.decorator.design.decorators;

import org.example.structural.decorator.design.Message;

public class HtmlEncodedMessage implements Message { //HtmlEncodedMessage is a Message

    private Message msg; // HtmlEncodedMessage also has a Message

    public HtmlEncodedMessage(Message msg) {
        this.msg = msg;
    }

    @Override
    public String getContent() {
        return msg.getContent() + " added by html decorator"; // decorated by html encoder
    }
}
