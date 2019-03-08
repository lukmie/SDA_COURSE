package com.javagda23.zad1;

public class Corka implements CzlonekRodziny {

    private String name;

    public Corka(String name) {
        this.name = name;
    }

    public void przedstawSie() {
        System.out.println("Jestem corka. Nazywam się " + this.name);
    }

    public boolean jestDorosly() {
        return false;
    }
}
