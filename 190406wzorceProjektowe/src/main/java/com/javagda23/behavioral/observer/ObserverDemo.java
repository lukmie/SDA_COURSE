package com.javagda23.behavioral.observer;

import com.javagda23.behavioral.observer.zad1.*;

public class ObserverDemo {
    public static void main(String[] args) {
        final Subject subject = new Subject();

        final Observer observerA = new ConcreteValueObserver(subject);
        final Observer observerB = new ValueLoweredObserver(subject);
        final Observer observerC = new ByTenChangedObserver(subject);


        subject.valueChanged(3);
        subject.valueChanged(5);
        subject.valueChanged(4);
        subject.valueChanged(-15);

    }
}
