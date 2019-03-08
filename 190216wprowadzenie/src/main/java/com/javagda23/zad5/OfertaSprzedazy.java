package com.javagda23.zad5;

public class OfertaSprzedazy {
    private String nazwaProduktu;
    private int cena;

    public OfertaSprzedazy(String nazwaProduktu, int cena) {
        this.nazwaProduktu = nazwaProduktu;
        this.cena = cena;
    }

    public String getNazwaProduktu() {
        return nazwaProduktu;
    }

    public int getCena() {
        return cena;
    }

    @Override
    public String toString() {
        return "OfertaSprzedazy{" +
                "nazwaProduktu='" + nazwaProduktu + '\'' +
                ", cena=" + cena +
                '}';
    }
}
