package org.example.behavioral.observer.design.observable;

import org.example.behavioral.observer.design.observers.Observer;

public interface Observable {

    public int getTemp();
    public void addObservers(Observer observer);

   // public void removeObservers(); // can also have this method

    public void update();

}
