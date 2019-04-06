package com.javagda23.structural.facade;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.PriorityBlockingQueue;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("e", 3, 33.0);
        Product product3 = new Product("e", 3, 33.3);
        List<Product> products = Arrays.asList(product, product3);
        PaymanetService paymanetService = new PaymanetService();
        System.out.println(paymanetService.pay(products));
    }
}
