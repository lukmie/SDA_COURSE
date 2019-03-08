package com.javagda23.zad7;

import java.util.Comparator;

public class KryteriumBramekTrafionych implements Comparator<DruzynaPilkarska> {
    @Override
    public int compare(DruzynaPilkarska o1, DruzynaPilkarska o2) {
        if (o1.getBramkiTrafione() < o2.getBramkiTrafione()) {
            return 1;
        } else if (o1.getBramkiTrafione() > o2.getBramkiTrafione()) {
            return -1;
        }
        return 0;
    }
}
