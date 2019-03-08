package com.javagda23.zad5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<OfertaSprzedazy> list = new ArrayList<>(Arrays.asList(
                new OfertaSprzedazy("a", 22),
                new OfertaSprzedazy("v", 2222),
                new OfertaSprzedazy("z", 983)

        ));

        Collections.sort(list, new CenaKomparator(true));
        for (OfertaSprzedazy ofertaSprzedazy : list) {
            System.out.println(ofertaSprzedazy.toString());
        }



    }
}
