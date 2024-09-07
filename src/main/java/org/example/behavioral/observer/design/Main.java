package org.example.behavioral.observer.design;

import org.example.behavioral.observer.design.observable.Observable;
import org.example.behavioral.observer.design.observable.WeatherStation;
import org.example.behavioral.observer.design.observers.Mobile;
import org.example.behavioral.observer.design.observers.Observer;
import org.example.behavioral.observer.design.observers.TV;

public class Main {

    public static void main(String[] args) {
        Observable observable = new WeatherStation();

        Observer observer1 = new TV();
        Observer observer2 = new Mobile();

        observable.addObservers(observer1);
        observable.addObservers(observer2);

        observable.update();
    }
}
