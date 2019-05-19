package com.lukmie.zad3;

import java.util.concurrent.CountDownLatch;

public class Jas implements Runnable {

    private CountDownLatch latch;

    public Jas(CountDownLatch latch) {
        this.latch = latch;
    }

    public void run() {
        try {
            System.out.println("Przygotowanie sniadania Jas");
            Thread.sleep(1000);
            System.out.println("Prysznic Jas");
            Thread.sleep(4000);
            System.out.println("Ubranie sie Jas");
            Thread.sleep(1000);
            System.out.println("Zakupy Jas");
            Thread.sleep(1000);
            System.out.println("Konsola Jas");
            Thread.sleep(2000);

            latch.countDown();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
