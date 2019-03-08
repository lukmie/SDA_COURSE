package com.javagda23.zad13;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new TreeSet<>(Arrays.asList(10,12,10,3,4,12,12,300,12,40,55));

        System.out.println("Rozmiar: " + set1.size());

        for (Integer elements : set1) {
            System.out.println(elements);
        }

        set1.remove(10);
        set1.remove(12);

        System.out.println("Rozmiar: " + set1.size());

        for (Integer elements : set1) {
            System.out.println(elements);
        }

    }
}
