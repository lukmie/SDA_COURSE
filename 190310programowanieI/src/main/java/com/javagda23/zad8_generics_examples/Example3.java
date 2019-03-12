package com.javagda23.zad8_generics_examples;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Example3 {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add("Hello");
        list.add(LocalDate.now());
        list.add(3);
        System.out.println(list);
    }
}
