package com.javagda23.zad1;

public class Ojciec  extends Parametr implements CzlonekRodziny {

    public Ojciec(String imie) {
        super(imie);
    }

    public void nakrzycz() {
        System.out.println("ojojoj!");
    }
    public void przedstawSie() {
        System.out.println("Jestem ojcem. Nazywam się " + getImie());
    }

    public boolean jestDorosly() {
        return true;
    }
}
