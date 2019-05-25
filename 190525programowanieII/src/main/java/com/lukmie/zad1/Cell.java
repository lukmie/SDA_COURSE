package com.lukmie.zad1;

public class Cell<T> {
    private T value;
    private Cell<T> next;

    public Cell(T value, Cell<T> next) {
        this.value = value;
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Cell getNext() {
        return next;
    }

    public void setNext(Cell next) {
        this.next = next;
    }
}
