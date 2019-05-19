package com.lukmie.zad5;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Parzyste {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService threadPool = Executors.newFixedThreadPool(4);

//        threadPool.submit(new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        });

        final AtomicInteger liczbyParzyste = new AtomicInteger(0);
        final AtomicInteger liczbyNieParzyste = new AtomicInteger(0);
        for (int liczba = 0; liczba < 10_000; liczba++) {
            final int finalLiczba = liczba;
            threadPool.submit(new Runnable() {
                @Override
                public void run() {
                    if (finalLiczba % 2 == 0){
                        liczbyParzyste.incrementAndGet();
                    } else {
                        liczbyNieParzyste.incrementAndGet();
                    }
                }
            });

        }
        threadPool.shutdown();
        threadPool.awaitTermination(1, TimeUnit.HOURS);
        System.out.println("Parzystych jest: " + liczbyParzyste.get());
        System.out.println("Parzystych jest: " + liczbyNieParzyste.get());
    }
}
