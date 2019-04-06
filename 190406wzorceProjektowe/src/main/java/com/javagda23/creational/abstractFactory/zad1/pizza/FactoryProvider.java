package com.javagda23.creational.abstractFactory.zad1.pizza;

import com.javagda23.creational.abstractFactory.zad1.AbstractFactory;
import com.javagda23.creational.abstractFactory.zad1.FactoryCategory;
import com.javagda23.creational.abstractFactory.zad1.car.CarFactory;

public class FactoryProvider {
    public AbstractFactory getFactory(FactoryCategory factoryCategory){
        switch (factoryCategory){
            case CAR:
                return new CarFactory();
            case PIZZA:
                return new PizzaFactory();
        }
        throw new RuntimeException("Factory type unknown");
    }
}
