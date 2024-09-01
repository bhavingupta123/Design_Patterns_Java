package org.example.behavioral.command.design;

import org.example.behavioral.command.design.command.TurnOffACCommand;
import org.example.behavioral.command.design.command.TurnOnAcCommand;
import org.example.behavioral.command.design.receiver.ACReceiver;

public class Main {

    public static void main(String[] args) {

        // object receiving the command
        ACReceiver acReceiver = new ACReceiver();

        // remote
        MyRemoteControl myRemoteControl = new MyRemoteControl();

        myRemoteControl.setCommand(new TurnOnAcCommand(acReceiver));
        myRemoteControl.pressButton(); // client only cares about pressing the button

        System.out.println("*************************");

        myRemoteControl.setCommand(new TurnOffACCommand(acReceiver));
        myRemoteControl.pressButton(); // client only cares about pressing the button

    }
}
