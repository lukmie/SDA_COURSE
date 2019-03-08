package com.javagda23.zad5;

public enum PodatekProduktu {
    VAT8(0.08),
    VAT23(0.23),
    VAT5(0.05),
    NO_VAT(0);

    private double podatek;

    PodatekProduktu(double podatek) {
        this.podatek = podatek;
    }

    public double getPodatek() {
        return podatek;
    }
}
