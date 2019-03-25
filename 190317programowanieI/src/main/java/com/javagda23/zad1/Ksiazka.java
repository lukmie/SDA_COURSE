package com.javagda23.zad1;

public class Ksiazka {
    private String ISBN;
    private String tytul;
    private int liczbaStron;
    private Gatunek gatunek;
    private Autor autor;
    private int rokPublikacji;

    public Ksiazka(String ISBN, String tytul, int liczbaStron, Gatunek gatunek, Autor autor, int rokPublikacji) {
        this.ISBN = ISBN;
        this.tytul = tytul;
        this.liczbaStron = liczbaStron;
        this.gatunek = gatunek;
        this.autor = autor;
        this.rokPublikacji = rokPublikacji;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public int getLiczbaStron() {
        return liczbaStron;
    }

    public void setLiczbaStron(int liczbaStron) {
        this.liczbaStron = liczbaStron;
    }

    public Gatunek getGatunek() {
        return gatunek;
    }

    public void setGatunek(Gatunek gatunek) {
        this.gatunek = gatunek;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getRokPublikacji() {
        return rokPublikacji;
    }

    public void setRokPublikacji(int rokPublikacji) {
        this.rokPublikacji = rokPublikacji;
    }

    @Override
    public String toString() {
        return "Ksiazka{" +
                "ISBN='" + ISBN + '\'' +
                ", tytul='" + tytul + '\'' +
                ", liczbaStron=" + liczbaStron +
                ", gatunek=" + gatunek +
                ", autor=" + autor +
                ", rokPublikacji=" + rokPublikacji +
                '}';
    }
}
