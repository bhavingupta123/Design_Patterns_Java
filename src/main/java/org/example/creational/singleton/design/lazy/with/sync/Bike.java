package org.example.creational.singleton.design.lazy.with.sync;

public class Bike {

    private static volatile Bike INSTANCE; // make volatile, not used caches version, refer to main memory

    private Bike(){

    }

    // uses double check locking, as shown below
    public static Bike getInstance(){

        if(INSTANCE == null) { // if instance is null

            synchronized (Bike.class) { // make it thread safe, class level lock

                if(INSTANCE == null){ // check once again instance is null, when we get the lock

                    INSTANCE = new Bike();
                }

            }
        }

        return INSTANCE;
    }
}
