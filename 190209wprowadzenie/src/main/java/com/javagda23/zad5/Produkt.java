package com.javagda23.zad5;

public class Produkt {
    private String nazwa;
    private Double cenaNetto;
    private PodatekProduktu iloscPodatku;

    public Produkt(String nazwa, Double cenaNetto, PodatekProduktu iloscPodatku) {
        this.nazwa = nazwa;
        this.cenaNetto = cenaNetto;
        this.iloscPodatku = iloscPodatku;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Double getCenaNetto() {
        return cenaNetto;
    }

    public void setCenaNetto(Double cenaNetto) {
        this.cenaNetto = cenaNetto;
    }

    public PodatekProduktu getIloscPodatku() {
        return iloscPodatku;
    }

    public void setIloscPodatku(PodatekProduktu iloscPodatku) {
        this.iloscPodatku = iloscPodatku;
    }

    public double podajCeneBrutto(){
        return cenaNetto + iloscPodatku.getPodatek() +cenaNetto*iloscPodatku.getPodatek();
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "nazwa='" + nazwa + '\'' +
                ", cenaNetto=" + cenaNetto +
                ", iloscPodatku=" + iloscPodatku +
                '}';
    }
}
