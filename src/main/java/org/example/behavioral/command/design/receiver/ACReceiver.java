package org.example.behavioral.command.design.receiver;

public class ACReceiver {

    public void increaseTemp(String contact){
        System.out.println("tem " + contact);
    }

    public void turnAcOn(){
        System.out.println("ac is turned on");
    }

    public void turnAcOffStep1(){
        System.out.println("flap closing");
    }

    public void turnAcOffStep2(){
        System.out.println("ac closing");
    }

    public void turnAcOffStep3(){
        System.out.println("all done and everything is closed");
    }

    public void removeMember(String contact){
        System.out.println("removed" + contact);
    }
}
