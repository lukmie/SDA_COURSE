package com.javagda23.zad12_set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        Zasad Liskov'a
//        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();


        // elementy w secie nie są poukładane
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(5);
        set.add(5);
        set.add(null);
        set.add(null);
        System.out.println(set);// elementów: 6



        Set<String> setString = new HashSet<>();

        List<Integer> ar = new ArrayList<>();
    }
}
