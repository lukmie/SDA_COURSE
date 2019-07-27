package com.lukmie.zad1;

import com.lukmie.entity.Klient;
import com.lukmie.entity.Pracownik;
import org.hibernate.Session;
import com.lukmie.HibernateUtil;

public class Main {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Klient klient1 = new Klient();
        klient1.setImie("Jan");
        klient1.setNazwisko("Kowalski");
        klient1.setNazwaFirmy("PKO");
        klient1.setTelefonKont("123");
        session.persist(klient1);

        Pracownik pracownik1 = new Pracownik();
        pracownik1.setImie("Adam");
        pracownik1.setNazwisko("Acc");
        pracownik1.setStanowisko("ksiegowy");
        pracownik1.setWynagrodzenie(3000.0);
        pracownik1.setNazwaFirmy("PKO");
        session.persist(pracownik1);

        session.flush();
        session.close();
    }
}
