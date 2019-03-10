package com.javagda23.zad10_function;

import com.javagda23.zad9_predicate.Urlop;

public class Pracownik {
    private String imie;
    private String nazwisko;
    private Urlop urlop;

    public Pracownik(String imie, String nazwisko, Urlop urlop) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.urlop = urlop;
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

    public Urlop getUrlop() {
        return urlop;
    }

    public void setUrlop(Urlop urlop) {
        this.urlop = urlop;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", urlop=" + urlop +
                '}';
    }
}
