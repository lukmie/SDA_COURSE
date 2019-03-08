package com.javagda23.training.zad2;

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
        return "{" +
                "nazwaProduktu='" + nazwaProduktu + '\'' +
                ", cena=" + cena +
                '}';
    }
}
