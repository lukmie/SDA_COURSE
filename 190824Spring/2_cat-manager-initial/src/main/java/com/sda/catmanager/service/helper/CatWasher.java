package com.sda.catmanager.service.helper;

import com.sda.catmanager.model.Cat;
import org.springframework.stereotype.Component;

@Component
public class CatWasher {

    public void washCat(Cat cat) {
        System.out.println("Washing " + cat.getName());
    }
}
