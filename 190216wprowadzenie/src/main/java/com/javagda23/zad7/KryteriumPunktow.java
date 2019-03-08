package com.javagda23.zad7;

import java.util.Comparator;

public class KryteriumPunktow implements Comparator<DruzynaPilkarska> {
    @Override
    public int compare(DruzynaPilkarska o1, DruzynaPilkarska o2) {
        if (o1.getLiczbaPunkow() < o2.getLiczbaPunkow()) {
            return 1;
        } else if (o1.getLiczbaPunkow() > o2.getLiczbaPunkow()) {
            return -1;
        }
        if (o1.getBramkiTrafione() < o2.getBramkiTrafione()) {
            return 1;
        } else if (o1.getBramkiTrafione() > o2.getBramkiTrafione()) {
            return -1;
        }
        if (o1.getBramkiStracone() > o2.getBramkiStracone()) {
            return 1;
        } else if (o1.getBramkiStracone() < o2.getBramkiStracone()) {
            return -1;
        }
        return 0;
    }
}
