package com.javagda23.zad1;

public class Autor {
    private String imie;
    private String nazwisko;
    private KrajPochodzenia krajPochodzenia;

    public Autor(String imie, String nazwisko, KrajPochodzenia krajPochodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.krajPochodzenia = krajPochodzenia;
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

    public KrajPochodzenia getKrajPochodzenia() {
        return krajPochodzenia;
    }

    public void setKrajPochodzenia(KrajPochodzenia krajPochodzenia) {
        this.krajPochodzenia = krajPochodzenia;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", krajPochodzenia=" + krajPochodzenia +
                '}';
    }
}
