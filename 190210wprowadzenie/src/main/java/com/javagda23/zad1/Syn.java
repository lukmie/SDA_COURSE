package com.javagda23.zad1;

public class Syn implements CzlonekRodziny {

    private String name;

    public Syn(String name) {
        this.name = name;
    }

    public void przedstawSie() {
        System.out.println("Kto pyta? Nazywam się " + this.name);
    }

    public boolean jestDorosly() {
        return false;
    }
}
