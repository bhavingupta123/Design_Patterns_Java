package org.example.behavioral.observer.design.observers;

import org.example.behavioral.observer.design.observable.Observable;

public class Mobile implements Observer{

    @Override
    public void update(Observable o) {
        System.out.println("Mobile:" + o.getTemp());
    }
}
