package org.example.creational.prototype.design;

public abstract class GameUnit implements Cloneable{

    private String position;

    public GameUnit(){
        position = "start";
    }

    protected void intialize(){
        this.position = "start";
    }

    public abstract void reset();

    @Override
    public GameUnit clone() throws CloneNotSupportedException{
        GameUnit gameUnit = (GameUnit) super.clone();

        gameUnit.intialize();
        gameUnit.reset();

        return gameUnit;
    }
}
