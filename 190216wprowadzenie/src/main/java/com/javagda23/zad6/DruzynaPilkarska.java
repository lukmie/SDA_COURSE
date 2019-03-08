package com.javagda23.zad6;

public class DruzynaPilkarska {
    private String nazwa;
    private double pozycjaWRankingu;
    private double silaDruzyny;

    public DruzynaPilkarska(String nazwa, double pozycjaWRankingu, double silaDruzyny) {
        this.nazwa = nazwa;
        this.pozycjaWRankingu = pozycjaWRankingu;
        this.silaDruzyny = silaDruzyny;
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getPozycjaWRankingu() {
        return pozycjaWRankingu;
    }

    public double getSilaDruzyny() {
        return silaDruzyny;
    }

    @Override
    public String toString() {
        return "DruzynaPilkarska{" +
                "nazwa='" + nazwa + '\'' +
                ", pozycjaWRankingu=" + pozycjaWRankingu +
                ", silaDruzyny=" + silaDruzyny +
                '}';
    }
}
