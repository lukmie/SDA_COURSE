package com.javagda23.behavioral.observer.zad1;

public class ConcreteValueObserver extends Observer {


    public ConcreteValueObserver(Subject subject) {
        this.subject = subject;
        this.subject.register(this); //sam jestem klasą observer stąd this
    }

    @Override
    public void update() {
        System.out.println("CONCRETE VALUE OBSERVER, NEW VALUE: " + subject.getValue());
    }
}
