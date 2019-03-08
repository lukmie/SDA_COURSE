package com.javagda23.zad7;

public class DruzynaPilkarska {
    private String nazwaDruzyny;
    private int bramkiTrafione;
    private int bramkiStracone;
    private int meczeWygrane;
    private int meczePrzegrane;
    private int meczeZremisowane;
    private int liczbaPunkow;

    public DruzynaPilkarska(String nazwaDruzyny, int bramkiTrafione, int bramkiStracone, int meczeWygrane, int meczePrzegrane, int meczeZremisowane, int liczbaPunkow) {
        this.nazwaDruzyny = nazwaDruzyny;
        this.bramkiTrafione = bramkiTrafione;
        this.bramkiStracone = bramkiStracone;
        this.meczeWygrane = meczeWygrane;
        this.meczePrzegrane = meczePrzegrane;
        this.meczeZremisowane = meczeZremisowane;
        this.liczbaPunkow = liczbaPunkow;
    }

    public String getNazwaDruzyny() {
        return nazwaDruzyny;
    }

    public void setNazwaDruzyny(String nazwaDruzyny) {
        this.nazwaDruzyny = nazwaDruzyny;
    }

    public int getBramkiTrafione() {
        return bramkiTrafione;
    }

    public void setBramkiTrafione(int bramkiTrafione) {
        this.bramkiTrafione = bramkiTrafione;
    }

    public int getBramkiStracone() {
        return bramkiStracone;
    }

    public void setBramkiStracone(int bramkiStracone) {
        this.bramkiStracone = bramkiStracone;
    }

    public int getMeczeWygrane() {
        return meczeWygrane;
    }

    public void setMeczeWygrane(int meczeWygrane) {
        this.meczeWygrane = meczeWygrane;
    }

    public int getMeczePrzegrane() {
        return meczePrzegrane;
    }

    public void setMeczePrzegrane(int meczePrzegrane) {
        this.meczePrzegrane = meczePrzegrane;
    }

    public int getMeczeZremisowane() {
        return meczeZremisowane;
    }

    public void setMeczeZremisowane(int meczeZremisowane) {
        this.meczeZremisowane = meczeZremisowane;
    }

    public int getLiczbaPunkow() {
        return liczbaPunkow;
    }

    public void setLiczbaPunkow(int liczbaPunkow) {
        this.liczbaPunkow = liczbaPunkow;
    }

    @Override
    public String toString() {
        return "DruzynaPilkarska{" +
                "nazwaDruzyny='" + nazwaDruzyny + '\'' +
                ", bramkiTrafione=" + bramkiTrafione +
                ", bramkiStracone=" + bramkiStracone +
                ", meczeWygrane=" + meczeWygrane +
                ", meczePrzegrane=" + meczePrzegrane +
                ", meczeZremisowane=" + meczeZremisowane +
                ", liczbaPunkow=" + liczbaPunkow +
                '}';
    }
}
