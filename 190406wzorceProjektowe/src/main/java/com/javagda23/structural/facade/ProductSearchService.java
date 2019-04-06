package com.javagda23.structural.facade;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class ProductSearchService {

    private static List<Product> PRODUCTS = Arrays.asList(
            new Product("a", 1, 3.3),
            new Product("b", 2, 12.3),
            new Product("c", 3, 9.3),
            new Product("d", 4, 123.3),
            new Product("e", 5, 45.3)
    );

    public Optional<Product> findById(final int id){
        return PRODUCTS.stream()
                .filter(product -> product.getId() == id)
                .findFirst();
    }


}
