package com.lukmie.zad3_Biblioteka;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> autorzy = new ArrayList<>();
        Biblioteka biblioteka = new Biblioteka();

        Ksiazka ksiazka1 = new Ksiazka("Jas i Malgosia", autorzy, 1991);
        Ksiazka ksiazka2 = new Ksiazka("Jas i Malgosia", autorzy, 1992);
        Ksiazka ksiazka3 = new Ksiazka("Jas i Malgosia", autorzy, 1993);

        biblioteka.dodajKsiazke(ksiazka1);
        biblioteka.dodajKsiazke(ksiazka2);
        biblioteka.dodajKsiazke(ksiazka3);

        biblioteka.wypozyczKsiazke(ksiazka2);

        System.out.println(biblioteka.wszystkieKsiazkiWZbiorze().size());
        System.out.println(biblioteka.wszystkieDostepneKsiazki().size());

    }
}
