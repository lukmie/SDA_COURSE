package com.lukmie.cats.service.mapper;

import com.lukmie.cats.model.*;

import java.util.stream.Collectors;

public class CatMapper {

    public static Cat map(CreateCatRequest catRequest) {
        Cat cat = new Cat();
        cat.setName(catRequest.getName());
        cat.setGender(catRequest.getGender());
        cat.setTailLength(catRequest.getTailLength());
        cat.setToys(catRequest.getToys()
                .stream()
                .map(CatMapper::mapToy)
                .collect(Collectors.toList())
        );
        return cat;
    }

    private static Toy mapToy(CreateToyRequest toyRequest) {
        return new Toy(toyRequest.getName());
    }
}
