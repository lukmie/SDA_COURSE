package com.javagda23.zad8_generics_examples;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
//        list.add(new Date());
//        Integer i = list.get(0);
        for (String s : list) {
            System.out.printf("%s has length %d%n", s, s.length());
        }


    }
}
