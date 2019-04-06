package com.javagda23.creational.abstractFactory.zad1.pizza;

import com.javagda23.creational.abstractFactory.zad1.AbstractFactory;

public class PizzaFactory implements AbstractFactory<Pizza> {
    @Override
    public Pizza create(String type) {
        switch (type){
            case "SM":
                return createSmallMargarita();
            case "BM":
                return createBigMargarita();
        }
        throw new RuntimeException("Pizza type not found.");
    }

    private Pizza createSmallMargarita(){
        return new Margarita(Base.FLAT, 25.0);
    }

    private Pizza createBigMargarita(){
        return new Margarita(Base.THICK, 45.0);
    }
}
