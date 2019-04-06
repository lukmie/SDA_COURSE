package com.javagda23.creational.singleton.zad1;

public class Counter {
    private int counter = 0;
    private static Counter counterInstance = new Counter(); //singleton typu eager, takie pole jest jedno dla klasy

    public static Counter getInstance(){
        return counterInstance;
    }

    private Counter() {}

    public void add1(){
        counter += 1;
        System.out.println("Counter is = " + counter);
    }

    public void add2(){
        counter += 2;
        System.out.println("Counter is = " + counter);
    }

    public void add3(){
        counter += 3;
        System.out.println("Counter is = " + counter);
    }
}