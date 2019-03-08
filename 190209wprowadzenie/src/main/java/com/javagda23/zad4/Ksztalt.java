package com.javagda23.zad4;

public enum Ksztalt {
    TROJKAT(3),
    CZWOROKAT(4),
    PIECIOKAT(5);

    private int iloscWierzch;

    Ksztalt(int iloscWierzch) {
        this.iloscWierzch = iloscWierzch;
    }

    public int getIloscWierzch() {
        return iloscWierzch;
    }
}
