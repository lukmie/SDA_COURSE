package com.sda.catmanager.service;

import com.sda.catmanager.model.Cat;
import com.sda.catmanager.service.helper.CatFeeder;
import com.sda.catmanager.service.helper.CatWasher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CatManager {

    private CatWasher catWasher;
    private CatFeeder catFeeder;

    @Autowired
    public CatManager(CatWasher catWasher, CatFeeder catFeeder) {
        this.catWasher = catWasher;
        this.catFeeder = catFeeder;
    }

    public void washCat(Cat cat) {
        catWasher.washCat(cat);
    }

    public void feedCat(Cat cat, int mealNumber) {
        catFeeder.feedCat(cat, mealNumber);
    }
}
