package com.lukmie.zad3;


import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(2);

        Thread jas = new Thread(new Jas(latch));
        Thread malgosia = new Thread(new Malgosia(latch));

        jas.start();
        malgosia.start();

        latch.await();

        System.out.println("Koniec dnia");
    }
}















//https://www.geeksforgeeks.org/countdownlatch-in-java/