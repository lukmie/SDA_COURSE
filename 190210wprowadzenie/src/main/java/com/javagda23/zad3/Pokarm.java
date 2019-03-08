package com.javagda23.zad3;

public class Pokarm {
    private String nazwa;
    private TypPokarmu typPokarmu;
    private int waga;

    public Pokarm(String nazwa, TypPokarmu typPokarmu, int waga) {
        this.nazwa = nazwa;
        this.typPokarmu = typPokarmu;
        this.waga = waga;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public TypPokarmu getTypPokarmu() {
        return typPokarmu;
    }

    public void setTypPokarmu(TypPokarmu typPokarmu) {
        this.typPokarmu = typPokarmu;
    }

    public int getWaga() {
        return waga;
    }

    public void setWaga(int waga) {
        this.waga = waga;
    }
}
