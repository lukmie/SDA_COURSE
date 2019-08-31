package com.lukmie.cats.service.mapper;

import com.lukmie.cats.model.Cat;
import com.lukmie.cats.model.CreateCatRequest;

public class CatMapper {

    public static Cat map(CreateCatRequest catRequest) {
        Cat cat = new Cat();
        cat.setName(catRequest.getName());
        cat.setGender(catRequest.getGender());
        cat.setTailLength(catRequest.getTailLength());
        return cat;
    }
}
