package com.javagda23.zad8_generics_examples;

import java.util.ArrayList;
import java.util.List;

public class Example6 {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(3); ints.add(1); ints.add(4);
        ints.add(1); ints.add(9); ints.add(2);

        List<String> strings = new ArrayList<>();
        String s = "abc";
        strings.add(s);

        List<?> stuff = new ArrayList<>();

        print(ints);
        print(strings);
        print(stuff);
    }

    public static void print(List<?> list){
        for (Object o : list) {
            System.out.println(o);
        }

    }
}
