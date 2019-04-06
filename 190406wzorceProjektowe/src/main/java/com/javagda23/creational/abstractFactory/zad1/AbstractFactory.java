package com.javagda23.creational.abstractFactory.zad1;

public interface AbstractFactory<T> {
    T create(final String type);
}
