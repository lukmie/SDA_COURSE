package com.lukmie.zad3_zad4;

public class Ksiazka {
    private Integer id;
    private String tytul;

    public Ksiazka(String tytul) {
        this.tytul = tytul;
    }

    public Ksiazka() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    @Override
    public String toString() {
        return "Ksiazka{" +
                "id=" + id +
                ", tytul='" + tytul + '\'' +
                '}';
    }
}
