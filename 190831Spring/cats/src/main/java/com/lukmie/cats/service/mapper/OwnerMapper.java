package com.lukmie.cats.service.mapper;

import com.lukmie.cats.model.CreateOwnerRequest;
import com.lukmie.cats.model.Owner;

import java.util.stream.Collectors;

public class OwnerMapper {

    public static Owner map(CreateOwnerRequest createOwnerRequest) {
        Owner owner = new Owner();
        owner.setName(createOwnerRequest.getName());
        owner.setCats(createOwnerRequest.getCats()
                .stream()
                .map(CatMapper::map)
                .collect(Collectors.toList()));
        return owner;
    }
}
