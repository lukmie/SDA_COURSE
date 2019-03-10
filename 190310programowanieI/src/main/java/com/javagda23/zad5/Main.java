package com.javagda23.zad5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Sprawdzenie, ze strumienie nie zmieniaja listy liczb
        List<Integer> listaLiczb = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("\nWejściowa lista: ");
        listaLiczb.forEach(element -> System.out.println(element + " "));

        System.out.println("\nPrzetwarzam elementy listy wejściowej, co daje w wyniku: ");
        listaLiczb.stream()
                .filter(i -> i%2 ==0)
                .map(i -> i*10)
                .sorted(Collections.reverseOrder())
                .limit(3)
                .forEach(element -> System.out.println(element + " "));

//        listaLiczb.forEach(element -> System.out.println(element + " "));
    }
}
