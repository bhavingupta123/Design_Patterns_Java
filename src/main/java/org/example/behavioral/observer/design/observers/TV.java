package org.example.behavioral.observer.design.observers;

import org.example.behavioral.observer.design.observable.Observable;

public class TV implements Observer{
    @Override
    public void update(Observable o) {
        System.out.println("TV:" + o.getTemp());
    }
}
