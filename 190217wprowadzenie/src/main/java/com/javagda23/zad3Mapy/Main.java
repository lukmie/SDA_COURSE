package com.javagda23.zad3Mapy;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("123123", 5); // czas wyszukiwania w mapie jest O(1) = zerowy
        map.put("123125", 5);

        System.out.println("Rozmiar: " + map.size());
        map.put("123123", 10);
        System.out.println("Rozmiar: " + map.size());

        // villain = hashcode = 7
        // kurczak = hashcode = 7
        if (map.containsKey("123123")) {
            Integer wynik = map.get("123123");
            // jeśli nie będzie wyniku otrzymamy null
            System.out.println(wynik);
        }

        // 1. iteracja po kluczach:
        System.out.println("Klucze:");
        for (String s : map.keySet()) {
            System.out.println(s);
        }

        // 2. iteracja po wartościach:
        System.out.println("Wartości");
        for (Integer value : map.values()) {
            System.out.println(value);
        }

        // 3. iteracja po parach klucz+wartość
        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            String klucz = stringIntegerEntry.getKey();
            Integer wartosc = stringIntegerEntry.getValue();
            System.out.println("Klucz: " + klucz + " wartość: " + wartosc);
        }
        map.remove("123123");

    }

}
