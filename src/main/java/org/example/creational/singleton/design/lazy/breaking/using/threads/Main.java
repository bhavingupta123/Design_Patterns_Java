package org.example.creational.singleton.design.lazy.breaking.using.threads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.execute(() -> Car.getInstance());
        executorService.execute(() -> Car.getInstance());

    }
}
