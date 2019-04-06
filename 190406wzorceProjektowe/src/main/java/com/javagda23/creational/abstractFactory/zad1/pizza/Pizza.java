package com.javagda23.creational.abstractFactory.zad1.pizza;

import java.util.List;

public interface Pizza {
    String getName();
    Base getBaseType();
    Double getWidth();
    int getCheeseTypesNum();
    List<String> getIngredients();
}
