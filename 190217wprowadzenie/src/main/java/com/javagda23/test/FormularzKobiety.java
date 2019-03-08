package com.javagda23.test;


public class FormularzKobiety extends Formularz {
    private String kolorOczu;
    private String kolorWlosow;

    public FormularzKobiety(String imie, String nazwisko, int wiek, int wzrost, Plec plec, int zarobki, String kolorOczu, String kolorWlosow) {
        super(imie, nazwisko, wiek, wzrost, plec, zarobki);
        this.kolorOczu = kolorOczu;
        this.kolorWlosow = kolorWlosow;
    }

    @Override
    public String toString() {
        return super.toString() +
                "kolorOczu=" + kolorOczu + "\n" +
                "kolorWlosow=" + kolorWlosow + "\n" +
                "##################################";
    }
}