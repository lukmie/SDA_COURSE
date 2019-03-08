package com.javagda23.test;


public class Formularz {
    private String imie;
    private String nazwisko;
    private int wiek;
    private int wzrost;
    protected Plec plec;
    private int zarobki;

    public Formularz(String imie, String nazwisko, int wiek, int wzrost, Plec plec, int zarobki) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.wzrost = wzrost;
        this.plec = plec;
        this.zarobki = zarobki;
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

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public int getWzrost() {
        return wzrost;
    }

    public void setWzrost(int wzrost) {
        this.wzrost = wzrost;
    }

    public Plec getPlec() {
        return plec;
    }

    public void setPlec(Plec plec) {
        this.plec = plec;
    }

    public int getZarobki() {
        return zarobki;
    }

    public void setZarobki(int zarobki) {
        this.zarobki = zarobki;
    }

    @Override
    public String toString() {
        return "imie=" + imie + "\n" +
                "nazwisko=" + nazwisko + "\n" +
                "wiek=" + wiek + "\n" +
                "wzrost=" + wzrost + "\n" +
                "zarobki=" + zarobki + "\n" +
                "plec=" + plec + "\n" ;

    }
}