package org.example.creational.prototype.design;

// Let this not support cloning

public class GeneralMan extends GameUnit{

    private String state = "idle";

    public void boost(){
        this.state = "boost";
    }

    @Override
    public GameUnit clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException("clone not supported in general");
    }

    @Override
    public void reset() {
        throw new UnsupportedOperationException("reset not supported in general");
    }

    @Override
    public String toString() {
        return "GeneralMan{" +
                "state='" + state + '\'' +
                '}';
    }
}
