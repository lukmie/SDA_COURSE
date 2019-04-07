package com.javagda23.behavioral.observer.zad1;

public class ByTenChangedObserver extends Observer {

    private int lastValue;

    public ByTenChangedObserver(Subject subject) {
        this.subject = subject;
        this.subject.register(this);
        lastValue = subject.getValue();
    }

    @Override
    public void update() {
        if (Math.abs(subject.getValue() - lastValue) > 10){ //subject.getValue() - nowa wartość
            System.out.println("VALUE CHANGED BY 10: " + subject.getValue());
        }
        lastValue = subject.getValue();
    }
}
