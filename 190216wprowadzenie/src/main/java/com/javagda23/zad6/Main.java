package com.javagda23.zad6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DruzynaPilkarska d1 = new DruzynaPilkarska("dru1", 1.0, 1.0);
        DruzynaPilkarska d2 = new DruzynaPilkarska("dru2", 3.0, 3.0);
        DruzynaPilkarska d3 = new DruzynaPilkarska("dru3", 2.0, 8.0);

        List<DruzynaPilkarska> tabela = new ArrayList<>();
        tabela.add(d1);
        tabela.add(d2);
        tabela.add(d3);

        Collections.sort(tabela, new Comparator<DruzynaPilkarska>() {
            @Override
            public int compare(DruzynaPilkarska o1, DruzynaPilkarska o2) {
                if (o1.getPozycjaWRankingu() < o2.getPozycjaWRankingu()) {
                    return -1;
                } else if (o1.getPozycjaWRankingu() > o2.getPozycjaWRankingu()) {
                    return 1;
                }
                return 0;
            }
        });

        for (DruzynaPilkarska druzynaPilkarska : tabela) {
            System.out.println(druzynaPilkarska);
        }

        Collections.sort(tabela, new Comparator<DruzynaPilkarska>() {
            @Override
            public int compare(DruzynaPilkarska o1, DruzynaPilkarska o2) {
                if (o1.getSilaDruzyny()/o1.getPozycjaWRankingu() > o2.getSilaDruzyny()/o2.getPozycjaWRankingu()) {
                    return -1;
                } else if (o1.getSilaDruzyny()/o1.getPozycjaWRankingu() < o2.getSilaDruzyny()/o2.getPozycjaWRankingu()) {
                    return 1;
                }
                return 0;
            }
        });

        System.out.println("*********************");
        for (DruzynaPilkarska druzynaPilkarska : tabela) {
            System.out.println(druzynaPilkarska);
        }


    }
}
