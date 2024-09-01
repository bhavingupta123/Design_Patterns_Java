package org.example.behavioral.command.design.command;

import org.example.behavioral.command.design.receiver.ACReceiver;

public class TurnOffACCommand implements Command{

    private ACReceiver ACReceiver;

    public TurnOffACCommand(ACReceiver ACReceiver) {
        this.ACReceiver = ACReceiver;
    }

    // client doesn't care about all these steps, if steps change only need to make a change here
    @Override
    public void execute() {
        ACReceiver.turnAcOffStep1();
        ACReceiver.turnAcOffStep2();
        ACReceiver.turnAcOffStep3();
    }

    @Override
    public void unexecute() {

    }
}
