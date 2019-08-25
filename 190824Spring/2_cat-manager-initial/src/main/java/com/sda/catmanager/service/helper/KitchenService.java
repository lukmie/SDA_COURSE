package com.sda.catmanager.service.helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class KitchenService {

    private final static List<String> meals = Arrays.asList("Pizza", "Spagetti", "Pineapple", "Wasabi");
    @Autowired
    private Random random;

    public String prepareMeal() {
        String meal = meals.get(random.nextInt(meals.size()));
        System.out.println("Preparing " + meal);
        return meal;
    }
}
