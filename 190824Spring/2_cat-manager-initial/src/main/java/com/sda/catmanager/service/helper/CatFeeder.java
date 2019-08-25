package com.sda.catmanager.service.helper;

import com.sda.catmanager.model.Cat;
import org.springframework.stereotype.Component;

@Component
public class CatFeeder {

    private KitchenService kitchenService;

    public CatFeeder(KitchenService kitchenService) {
        this.kitchenService = kitchenService;
    }

    public void feedCat(Cat cat, int mealNumber) {
        String meal = kitchenService.prepareMeal();
        System.out.println("Feeding " + cat.getName() + " with " + meal);
    }
}
