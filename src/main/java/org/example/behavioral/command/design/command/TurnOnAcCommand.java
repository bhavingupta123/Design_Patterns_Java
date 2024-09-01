package org.example.behavioral.command.design.command;

import org.example.behavioral.command.design.receiver.ACReceiver;

public class TurnOnAcCommand implements Command{

    private ACReceiver ACReceiver;

    public TurnOnAcCommand(ACReceiver ACReceiver) {
        this.ACReceiver = ACReceiver;
    }

    @Override
    public void execute() {
        ACReceiver.turnAcOn();
    }

    @Override
    public void unexecute() {

    }
}
