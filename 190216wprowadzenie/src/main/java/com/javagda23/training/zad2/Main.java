package com.javagda23.training.zad2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<OfertaSprzedazy> list = new ArrayList<>(Arrays.asList(
                new OfertaSprzedazy("ag", 123),
                new OfertaSprzedazy("ax", 112),
                new OfertaSprzedazy("ga", 3),
                new OfertaSprzedazy("pl", 3123)
        ));

        Collections.sort(list, new OfertaComparator(false));

        for (OfertaSprzedazy ofertaSprzedazy : list) {
            System.out.println(ofertaSprzedazy);
        }

    }
}
