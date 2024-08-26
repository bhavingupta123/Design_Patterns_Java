package org.example.creational.singleton.design.lazy.without.sync;

public class Main {

    public static void main(String[] args) {
        LazyCycle lazyCycle = LazyCycle.getInstance();
        LazyCycle lazyCycle2 = LazyCycle.getInstance();

        System.out.println(lazyCycle2 == lazyCycle);
    }
}
