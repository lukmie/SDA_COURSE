package com.lukmie.zad3;

import com.lukmie.entity.Klient2;
import com.lukmie.entity.Pracownik2;

public class Main {
    public static void main(String[] args) {
        KlientDAO klientDAO = new KlientDAO();
        PracownikDAO pracownikDAO = new PracownikDAO();

        Klient2 klient2 = new Klient2();
        klient2.setImie("Adam");
        klient2.setNazwisko("Banach");
        klient2.setNazwaFirmy("SDA");
        klient2.setTelefonKont("123-456-789");

        Pracownik2 pracownik2 = new Pracownik2();
        pracownik2.setImie("Katarzyna");
        pracownik2.setNazwisko("Maslak");
        pracownik2.setNazwaFirmy("SDA");
        pracownik2.setStanowisko("ksiegowa");
        pracownik2.setWynagrodzenie(3000.0);

        klientDAO.add(klient2);
        pracownikDAO.add(pracownik2);

    }
}
