package com.javagda23.zad1;

public class Main {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Aa", "Bb", KrajPochodzenia.POL);
        Ksiazka ksiazka1 = new Ksiazka("123", "W pustyni", 300, Gatunek.KRYMINAL, autor1, 2012);
        Ksiazka ksiazka2 = new Ksiazka("321", "I w puszczy", 123, Gatunek.NOWELA, autor1, 2012);
        Biblioteka biblioteka = new Biblioteka();

        try {
            biblioteka.dodajKsiazke(ksiazka1);
            biblioteka.dodajKsiazke(ksiazka2);
        } catch (DuplicateEntryException e) {
            e.printStackTrace();
        }

//        System.out.println(biblioteka.wyszukajKsiazke("123"));

        try {
            biblioteka.usunKsiazke(ksiazka1);
        } catch (NoEntryException e) {
            e.printStackTrace();
        }

        biblioteka.pokazWszystkieKsiazki();
        biblioteka.znajdzKsiazkiRokAutorMalejaco(2012, autor1);



    }
}
