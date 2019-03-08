package com.javagda23.zad1;

public class Matka implements CzlonekRodziny {

    private String name;

    public Matka(String name) {
        this.name = name;
    }

    public void przedstawSie() {
        System.out.println("Jestem mamą. Nazywam się " + this.name);
    }

    public boolean jestDorosly() {
        return true;
    }
}
