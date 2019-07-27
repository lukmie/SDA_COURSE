package com.lukmie.zad1;

import com.lukmie.entity.Klient;
import com.lukmie.entity.Pracownik;

public class Main {
    public static void main(String[] args) {
        KlientDAO klientDAO = new KlientDAO();
        PracownikDAO pracownikDAO = new PracownikDAO();

        Klient klient2 = new Klient("PKO", "Robert", "Nowak", "321");
        Klient klient3 = new Klient("PKO", "Andrzej", "Nowak", "234");
        Klient klient4 = new Klient("PKO", "Michal", "Nowak", "668");

        Pracownik pracownik2 = new Pracownik("PKO", "Adam", "Malysz", "kasjer", 2000.0);
        Pracownik pracownik3 = new Pracownik("PKO", "Krystian", "Mateja", "kasjer", 2000.0);
        Pracownik pracownik4 = new Pracownik("PKO", "Pawel", "Malysz", "kasjer", 2000.0);

        klientDAO.add(klient2);
        klientDAO.add(klient3);
        klientDAO.add(klient4);

        pracownikDAO.add(pracownik2);
        pracownikDAO.add(pracownik3);
        pracownikDAO.add(pracownik4);

        System.out.println(klientDAO.findByNazwisko("Nowak"));

    }
}
