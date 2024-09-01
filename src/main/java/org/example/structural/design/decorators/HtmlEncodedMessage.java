package org.example.structural.design.decorators;

import org.example.structural.design.Message;

public class HtmlEncodedMessage implements Message {

    private Message msg;

    public HtmlEncodedMessage(Message msg) {
        this.msg = msg;
    }

    @Override
    public String getContent() {
        return msg.getContent() + " added by html decorator"; // decorated by html encoder
    }
}
