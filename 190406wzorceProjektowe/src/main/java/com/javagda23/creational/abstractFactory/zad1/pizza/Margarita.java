package com.javagda23.creational.abstractFactory.zad1.pizza;

import java.util.Arrays;
import java.util.List;

class Margarita implements Pizza {
    private Base base;
    private double width;

    public Margarita(Base base, double width) {
        this.base = base;
        this.width = width;
    }

    @Override
    public String getName() {
        return "Margarita: " + getBaseType().name();
    }

    @Override
    public Base getBaseType() {
        return null;
    }

    @Override
    public Double getWidth() {
        return null;
    }

    @Override
    public int getCheeseTypesNum() {
        return 1;
    }

    @Override
    public List<String> getIngredients() {
        return Arrays.asList("Cheese");
    }
}
