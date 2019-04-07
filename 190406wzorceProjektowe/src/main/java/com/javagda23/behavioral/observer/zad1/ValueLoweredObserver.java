package com.javagda23.behavioral.observer.zad1;

public class ValueLoweredObserver extends Observer {

    private int lastValue;

    public ValueLoweredObserver(Subject subject) {
        this.subject = subject;
        this.subject.register(this);
        lastValue = subject.getValue();
    }

    @Override
    public void update() {
        if (subject.getValue() < lastValue){
            System.out.println("VALUE LOWERED " + subject.getValue());
        }
        lastValue = subject.getValue();
    }
}
