package com.javagda23.zad1_dzienniczek;

public class Uczen {
    private String imie;
    private String nazwisko;
    private KlasaSzkolna klasaSzkolna;

    public Uczen(String imie, String nazwisko, KlasaSzkolna klasaSzkolna) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.klasaSzkolna = klasaSzkolna;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public KlasaSzkolna getKlasaSzkolna() {
        return klasaSzkolna;
    }

    public void setKlasaSzkolna(KlasaSzkolna klasaSzkolna) {
        this.klasaSzkolna = klasaSzkolna;
    }
}
