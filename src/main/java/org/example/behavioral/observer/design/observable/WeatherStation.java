package org.example.behavioral.observer.design.observable;

import org.example.behavioral.observer.design.observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Observable{
    
    List<Observer> observerList = new ArrayList<>();
    
    @Override
    public int getTemp() {
        return 10;
    }

    @Override
    public void addObservers(Observer observer) {
        observerList.add(observer);
    }

    public void update(){
        for (Observer o: observerList) {
            o.update(this);
        }
    }
}
