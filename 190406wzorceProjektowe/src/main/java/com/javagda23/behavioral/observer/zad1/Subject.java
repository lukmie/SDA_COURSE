package com.javagda23.behavioral.observer.zad1;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int value;

    public void register(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    public void unregister(Observer observer) {
        observers.remove(observer); //brak sprawdzenia if poniewaz nie ma znaczenia czy jest czy nie bo zwraca bool
    }

    public void valueChanged(int newValue) {
        value = newValue;
        notifyAllObservers();
    }

    private void notifyAllObservers() {
        observers.forEach(Observer::update);
    }

    public int getValue() {
        return value;
    }
}
