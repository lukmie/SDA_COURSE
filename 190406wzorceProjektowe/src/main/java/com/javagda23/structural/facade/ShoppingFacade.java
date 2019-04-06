package com.javagda23.structural.facade;

import java.util.List;
import java.util.stream.Collectors;

public class ShoppingFacade {
    private AvailabilityService availabilityService;
    private PaymanetService paymanetService;
    private ProductSearchService productSearchService;

    public ShoppingFacade(AvailabilityService availabilityService, PaymanetService paymanetService, ProductSearchService productSearchService) {
        this.availabilityService = availabilityService;
        this.paymanetService = paymanetService;
        this.productSearchService = productSearchService;
    }

    public void shop(List<Integer> ids){
        List<Integer> filteredIds = ids.stream()
                .filter(id -> productSearchService.findById(id).isPresent())
                .collect(Collectors.toList());

        filteredIds = filteredIds.stream()
                .filter(id -> availabilityService.isAvailable(id))
                .collect(Collectors.toList());

        List<Product> products = filteredIds.stream()
                .map(id -> productSearchService.findById(id).get())
                .collect(Collectors.toList());

        double sum = paymanetService.pay(products);

        System.out.println("you need to pay: " + sum);
    }
}
