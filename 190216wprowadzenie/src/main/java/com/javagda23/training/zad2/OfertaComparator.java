package com.javagda23.training.zad2;

import java.util.Comparator;

public class OfertaComparator implements Comparator<OfertaSprzedazy> {
    private boolean czyRosnaco;

    public OfertaComparator(boolean czyRosnaco) {
        this.czyRosnaco = czyRosnaco;
    }

    @Override
    public int compare(OfertaSprzedazy o1, OfertaSprzedazy o2) {
        if (o1.getCena() > o2.getCena()) return czyRosnaco ? 1 : -1;
        if (o1.getCena() < o2.getCena()) return czyRosnaco ? -1 : 11;
        return 0;
    }
}
