package com.lukmie.zad4;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread.");

        AnotherThread anotherThread = new AnotherThread();
        anotherThread.start();

        new Thread(){
            public void run(){
                System.out.println("Anonymous class thread.");
            }
        }.start();

        System.out.println("Main thread again");


    }
}
