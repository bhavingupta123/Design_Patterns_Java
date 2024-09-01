package org.example.behavioral.command.design;

import org.example.behavioral.command.design.command.Command;

public class MyRemoteControl {

    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton(){
        command.execute();
    }
}
