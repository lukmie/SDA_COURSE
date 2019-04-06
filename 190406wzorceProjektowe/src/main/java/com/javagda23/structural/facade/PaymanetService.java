package com.javagda23.structural.facade;

import java.util.List;

public class PaymanetService {

    public double pay(List<Product> productsToBuy){
        return productsToBuy.stream()
                .mapToDouble(product -> product.getPrice())
                .sum();
    }
}
