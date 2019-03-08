package com.javagda23.zad4;

public class MainRower {
    public static void main(String[] args) {

        Rower r1 = new Rower(21, TypRoweru.ROWER, "szosa");
        Rower r2 = new Rower(11, TypRoweru.TANDEM, "miejski");
        Rower r3 = new Rower(21, TypRoweru.ROWER, "mtb");

        Rower[] tab = new Rower[3];
        tab[0] = r1;
        tab[1] = r2;
        tab[2] = r3;

        for (Rower r : tab) {
            r.wypiszInformacje();
        }

    }
}
