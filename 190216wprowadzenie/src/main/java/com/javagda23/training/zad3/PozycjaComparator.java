package com.javagda23.training.zad3;

import java.util.Comparator;

public class PozycjaComparator implements Comparator<DruzynaPilkarska> {

    @Override
    public int compare(DruzynaPilkarska o1, DruzynaPilkarska o2) {
        if(o1.getPozycjaWRankingu() > o2.getPozycjaWRankingu()) return 1;
        if(o1.getPozycjaWRankingu() < o2.getPozycjaWRankingu()) return -1;
        return 0;
    }
}
