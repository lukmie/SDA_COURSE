package com.javagda23.zad3_sor;

import java.util.Random;

public enum Stan {
    KREYTYCZNY(1),
    POWAZNY(5),
    LEKKI(10);

    private Integer wartosc;

    Stan(Integer wartosc) {
        this.wartosc = wartosc;
    }

    public  Integer getWartosc() {
        return wartosc;
    }

    public static Stan losujStan() {
        return values()[new Random().nextInt(values().length)];
    }
}
