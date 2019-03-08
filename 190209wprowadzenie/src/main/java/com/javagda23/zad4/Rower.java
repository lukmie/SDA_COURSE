package com.javagda23.zad4;

public class Rower {
    private int iloscPrzerzutek;
    private TypRoweru typRoweru;
    private String nazwaRoweru;

    public Rower(int iloscPrzerzutek, TypRoweru typRoweru, String nazwaRoweru) {
        this.iloscPrzerzutek = iloscPrzerzutek;
        this.typRoweru = typRoweru;
        this.nazwaRoweru = nazwaRoweru;
    }

    public int getIloscPrzerzutek() {
        return iloscPrzerzutek;
    }

    public void setIloscPrzerzutek(int iloscPrzerzutek) {
        this.iloscPrzerzutek = iloscPrzerzutek;
    }

    public TypRoweru getTypRoweru() {
        return typRoweru;
    }

    public void setTypRoweru(TypRoweru typRoweru) {
        this.typRoweru = typRoweru;
    }

    public String getNazwaRoweru() {
        return nazwaRoweru;
    }

    public void setNazwaRoweru(String nazwaRoweru) {
        this.nazwaRoweru = nazwaRoweru;
    }

    public void wypiszInformacje(){
        System.out.println("Rower{" +
                "iloscPrzerzutek=" + iloscPrzerzutek +
                ", typRoweru=" + typRoweru +
                ", nazwaRoweru='" + nazwaRoweru + " ilość miejsc " + typRoweru.getIloscMiejsc());
    }


}
