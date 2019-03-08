package com.javagda23.zad6;

public class Pudelko<T> {
    private T zawartosc;

    public Pudelko() {
    }

    public Pudelko(T zawartosc) {
        this.zawartosc = zawartosc;
    }

    public T getZawartosc() {
        return zawartosc;
    }

    public void coJestWPudelku(){
        if(zawartosc != null){
            System.out.println("W pudełku jest " + zawartosc + ".");
        } else System.out.println("Pudelko jest puste.");
    }
}
