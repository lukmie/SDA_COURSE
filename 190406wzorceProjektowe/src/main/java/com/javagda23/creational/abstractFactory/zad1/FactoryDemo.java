package com.javagda23.creational.abstractFactory.zad1;

import com.javagda23.creational.abstractFactory.zad1.car.Car;
import com.javagda23.creational.abstractFactory.zad1.pizza.FactoryProvider;

public class FactoryDemo {

    public static void main(String[] args) {
        //create ToyotaCorolla
        AbstractFactory factory = new FactoryProvider().getFactory(FactoryCategory.CAR);
        final Car car = (Car)factory.create("CC");
        System.out.println(car.getModelName());
    }
}
