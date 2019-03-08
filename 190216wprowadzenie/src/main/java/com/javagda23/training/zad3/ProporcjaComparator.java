package com.javagda23.training.zad3;

import java.util.Comparator;

public class ProporcjaComparator implements Comparator<DruzynaPilkarska> {
    private Double sila1;
    private Double sila2;
    @Override
    public int compare(DruzynaPilkarska o1, DruzynaPilkarska o2) {
        sila1 = o1.getSilaDruzyny()/o1.getPozycjaWRankingu();
        sila2 = o2.getSilaDruzyny()/o2.getPozycjaWRankingu();

        if (sila1 > sila2) return -1;
        if (sila1 < sila2) return 1;
        return 0;
    }
}
