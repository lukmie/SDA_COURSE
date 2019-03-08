package com.javagda23.test;



public class FormularzMezczyzny extends Formularz {
    private int ileWyciskasz;

    public FormularzMezczyzny(String imie, String nazwisko, int wiek, int wzrost, Plec plec, int zarobki, int ileWyciskasz) {
        super(imie, nazwisko, wiek, wzrost, plec, zarobki);
        this.ileWyciskasz = ileWyciskasz;
    }

    @Override
    public String toString() {
        return super.toString() +
                "ileWyciskasz=" + ileWyciskasz + "\n" +
                "##################################";
    }
}