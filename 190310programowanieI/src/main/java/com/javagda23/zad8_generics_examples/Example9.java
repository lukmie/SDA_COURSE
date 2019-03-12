package com.javagda23.zad8_generics_examples;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Example9 {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5);
        List<Double> doubles = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        List<BigDecimal> bigDecimals = Arrays.asList(
                new BigDecimal("1.0"),
                new BigDecimal("2.0"),
                new BigDecimal("3.0"),
                new BigDecimal("4.0"),
                new BigDecimal("5.0")
        );

        System.out.printf("ints sum is %s%n", sumList(ints));
        System.out.printf("doubles sum is %s%n", sumList(doubles));
        System.out.printf("bigdecimals sum is %s%n", sumList(bigDecimals));
    }

    private static double sumList(List<? extends Number> list) {
        Number num = list.get(0);
        return list.stream()
                .mapToDouble(Number::doubleValue) // returns DoubleStream
                .sum();
    }
}
