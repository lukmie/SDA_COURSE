package com.lukmie.zad3_Biblioteka;

import java.util.List;
import java.util.Objects;

public class Ksiazka {
    private final String tytul;
    private final List<String> autorzy;
    private final int rokWydania;
    private boolean czyWypozyczona;

    public Ksiazka(String tytul, List<String> autorzy, int rokWydania) {
        this.tytul = tytul;
        this.autorzy = autorzy;
        this.rokWydania = rokWydania;
    }

    public String getTytul() {
        return tytul;
    }

    public boolean czyWypozyczona() {
        return czyWypozyczona;
    }

    public void ustawCzyWypozyczona(boolean czyWypozyczona) {
        this.czyWypozyczona = czyWypozyczona;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ksiazka ksiazka = (Ksiazka) o;
        return rokWydania == ksiazka.rokWydania &&
                tytul.equals(ksiazka.tytul) &&
                autorzy.equals(ksiazka.autorzy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tytul, autorzy, rokWydania);
    }

    @Override
    public String toString() {
        return "Ksiazka{" +
                "tytul='" + tytul + '\'' +
                ", autorzy=" + autorzy +
                ", rokWydania=" + rokWydania +
                '}';
    }
}
