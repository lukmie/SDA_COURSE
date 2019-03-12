package com.javagda23.zad8_generics_examples;

import java.util.ArrayList;
import java.util.List;

public class Example5 {
    public static void main(String[] args) {
        List<?> list = new ArrayList<>();
//        list.add(2);
        int x = list.size();
        System.out.println(x);
    }
}
