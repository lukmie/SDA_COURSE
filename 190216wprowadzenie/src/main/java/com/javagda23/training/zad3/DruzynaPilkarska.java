package com.javagda23.training.zad3;

public class DruzynaPilkarska {
    private String nazwa;
    private Double pozycjaWRankingu;
    private Double silaDruzyny;

    public DruzynaPilkarska(String nazwa, Double pozycjaWRankingu, Double silaDruzyny) {
        this.nazwa = nazwa;
        this.pozycjaWRankingu = pozycjaWRankingu;
        this.silaDruzyny = silaDruzyny;
    }

    public String getNazwa() {
        return nazwa;
    }

    public Double getPozycjaWRankingu() {
        return pozycjaWRankingu;
    }

    public Double getSilaDruzyny() {
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
