package com.javagda23.zad5;

import java.util.Comparator;

public class CenaKomparator implements Comparator<OfertaSprzedazy> {

    private boolean rosnaco;

    public CenaKomparator(boolean rosnaco) {
        this.rosnaco = rosnaco;
    }

    @Override
    public int compare(OfertaSprzedazy o1, OfertaSprzedazy o2) {
        if(rosnaco){
            if (o1.getCena() < o2.getCena()) {
                return (rosnaco ? 1 : -1);
            } else if (o1.getCena() > o2.getCena()) {
                return (rosnaco ? -1 : 1);
            }
        }
        return 0;
    }
}
