package org.example.creational.prototype.design;

public class SwordsMan extends GameUnit{

    private String state = "idle";

    public void attack(){
        this.state = "sword attacking";
    }

    @Override
    public void reset() {
        this.state = "idle";
    }

    @Override
    public String toString() {
        return "SwordsMan{" +
                "state='" + this.state + '\'' +
                '}';
    }
}
