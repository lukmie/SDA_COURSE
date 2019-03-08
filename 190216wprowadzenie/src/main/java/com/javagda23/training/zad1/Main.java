package com.javagda23.training.zad1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Osoba> list = new ArrayList<>(Arrays.asList(
                new Osoba("a", "z", 21),
                new Osoba("b", "f", 21),
                new Osoba("c", "a", 43),
                new Osoba("d", "g", 21),
                new Osoba("e", "a", 56)
        ));
        System.out.println("Przed sortowaniem: ");
        for (Osoba osoba : list) {
            System.out.println(osoba);
        }
        Collections.sort(list, new OsobaComparator());
        System.out.println("Po sortowaniu: ");
        for (Osoba osoba : list) {
            System.out.println(osoba);
        }

    }
}
