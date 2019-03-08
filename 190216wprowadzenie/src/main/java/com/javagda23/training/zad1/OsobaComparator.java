package com.javagda23.training.zad1;

import java.util.Comparator;

public class OsobaComparator implements Comparator<Osoba> {

    @Override
    public int compare(Osoba o1, Osoba o2) {
        if(o1.getWiek() > o2.getWiek()) return 1;
        if(o1.getWiek() < o2.getWiek()) return -1;
        return 0;
    }
}
