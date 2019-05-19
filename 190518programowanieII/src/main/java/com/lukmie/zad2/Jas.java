package com.lukmie.zad2;

public class Jas implements Runnable {

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

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
