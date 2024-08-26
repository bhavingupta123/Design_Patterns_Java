package org.example.creational.singleton.design.lazy.without.sync;

public class LazyCycle {

    private LazyCycle(){

    }

    // RegistryHolder will only be initialized when the getInstance() method is called
    private static class RegistryHolder{
        static LazyCycle INSTANCE = new LazyCycle();
    }

    public static LazyCycle getInstance(){
        return RegistryHolder.INSTANCE;
    }

}
