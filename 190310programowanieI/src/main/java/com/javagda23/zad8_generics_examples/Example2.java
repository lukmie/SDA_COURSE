package com.javagda23.zad8_generics_examples;

import java.util.ArrayList;
import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(10);
        list.add(6);
        list.add(4);

        for (int integer : list) {
            System.out.println(integer);
        }

    }
}
