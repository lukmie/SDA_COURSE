package com.lukmie.zad3;

import java.util.concurrent.CountDownLatch;

public class Malgosia implements Runnable {

    private CountDownLatch latch;

    public Malgosia(CountDownLatch latch) {
        this.latch = latch;
    }

    public void run() {
        try {
            System.out.println("Bieganie Malgosia");
            Thread.sleep(1000);
            System.out.println("Prysznic Malgosia");
            Thread.sleep(2000);
            System.out.println("Sniadanie Malgosia");
            Thread.sleep(1000);
            System.out.println("Ubranie Malgosia");
            Thread.sleep(3000);
            System.out.println("Kolezanka Malgosia");
            Thread.sleep(1000);

            latch.countDown();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
