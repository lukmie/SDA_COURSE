package com.lukmie.zad3;
//jak pobieram producenta to nie pobiera listy produktow gdy jest lazy loading
//dlaczego to działa: adres2.setKlient(klient2); a to nie:klient2.setAdres(adres2);
// po przypisaniu klientów do adresów przy ponownym zapisaniu klientów trzeba uzyć merge - update wtedy działa inaczej jest detatched

import com.lukmie.HibernateUtil;
import com.lukmie.entity.*;
import com.lukmie.zad3.dao.AdresDAO;
import com.lukmie.zad3.dao.KlientDAO;
import com.lukmie.zad3.dao.ProducentDAO;
import com.lukmie.zad3.dao.ProduktDAO;
import org.hibernate.Session;

public class Main {
    public static void main(String[] args) {

        ProducentDAO producentDAO = new ProducentDAO();
        KlientDAO klientDAO = new KlientDAO();
        ProduktDAO produktDAO = new ProduktDAO();
        AdresDAO adresDAO = new AdresDAO();

        Klient klient1 = new Klient("Adam", "Bielan", "123");
        Klient klient2 = new Klient("Robert", "Pudzianowski", "321");
        Klient klient3 = new Klient("Andrzej", "Małysz", "254");
        Klient klient4 = new Klient("Michał", "Kruczek", "783");
        Klient klient5 = new Klient("Patryk", "Mateja", "357");

        KategoriaProduktu kategoriaProduktu1 = new KategoriaProduktu("elektro-narzedzia");
        KategoriaProduktu kategoriaProduktu2 = new KategoriaProduktu("sruby");
        KategoriaProduktu kategoriaProduktu3 = new KategoriaProduktu("wiertla");

        Producent producent1 = new Producent("Stihll");
        Producent producent2 = new Producent("Bosch");

        Adres adres1 = new Adres("A", 1, 1, "01-111", "A");
        Adres adres2 = new Adres("B", 2, 2, "01-222", "B");
        Adres adres3 = new Adres("C", 3, 3, "01-333", "C");
        Adres adres4 = new Adres("D", 4, 4, "01-444", "D");
        Adres adres5 = new Adres("E", 5, 5, "01-555", "E");

        Produkt produkt1 = new Produkt("Wiertarka 550W", 159.00);
        Produkt produkt2 = new Produkt("Wiertarka 600W", 259.00);
        Produkt produkt3 = new Produkt("Wiertarka 700W", 359.00);
        Produkt produkt4 = new Produkt("Wiertarka 950W", 459.00);
        Produkt produkt5 = new Produkt("Wkretarka 200W", 59.00);
        Produkt produkt6 = new Produkt("Wiertla do drewna 10 sztuk", 29.00);
        Produkt produkt7 = new Produkt("Wiertla do metalu 10 sztuk", 29.00);
        Produkt produkt8 = new Produkt("Wiertla do betonu 10 sztuk", 29.00);
        Produkt produkt9 = new Produkt("Kolki 100 sztuk", 9.00);
        Produkt produkt10 = new Produkt("Sruby M24 10 sztuk", 13.00);


        adres1.setKlient(klient1);
        adres2.setKlient(klient2);
        adres3.setKlient(klient3);
        adres4.setKlient(klient4);
        adres5.setKlient(klient5);
        adresDAO.add(adres1);
        adresDAO.add(adres2);
        adresDAO.add(adres3);
        adresDAO.add(adres4);
        adresDAO.add(adres5);

        klient1.setAdres(adres1);

        produkt1.setKategoriaProduktu(kategoriaProduktu1);
        produkt1.setProducent(producent1);

        produkt2.setKategoriaProduktu(kategoriaProduktu1);
        produkt2.setProducent(producent1);

        produkt3.setKategoriaProduktu(kategoriaProduktu1);
        produkt3.setProducent(producent1);

        produkt4.setKategoriaProduktu(kategoriaProduktu1);
        produkt4.setProducent(producent1);

        produkt5.setKategoriaProduktu(kategoriaProduktu1);
        produkt5.setProducent(producent1);

        produkt6.setKategoriaProduktu(kategoriaProduktu3);
        produkt6.setProducent(producent2);

        produkt7.setKategoriaProduktu(kategoriaProduktu3);
        produkt7.setProducent(producent2);

        produkt8.setKategoriaProduktu(kategoriaProduktu3);
        produkt8.setProducent(producent2);

        produkt9.setKategoriaProduktu(kategoriaProduktu2);
        produkt9.setProducent(producent2);

        produkt10.setKategoriaProduktu(kategoriaProduktu2);
        produkt10.setProducent(producent2);

        klient1.getProduktList().add(produkt1);
        klient1.getProduktList().add(produkt2);
        klient1.getProduktList().add(produkt3);

        klient2.getProduktList().add(produkt4);
        klient2.getProduktList().add(produkt5);
        klient2.getProduktList().add(produkt6);

        klient3.getProduktList().add(produkt6);
        klient3.getProduktList().add(produkt7);
        klient3.getProduktList().add(produkt8);

        klient4.getProduktList().add(produkt9);
        klient4.getProduktList().add(produkt10);
        klient4.getProduktList().add(produkt3);

        klient5.getProduktList().add(produkt1);
        klient5.getProduktList().add(produkt2);
        klient5.getProduktList().add(produkt3);

        klientDAO.update(klient1);
        klientDAO.update(klient2);

        System.out.println(producentDAO.select(1));

//        Session session = HibernateUtil.getSessionFactory().openSession();
//        session.beginTransaction();
//
//        System.out.println(session.find(Klient.class, 1));
//        session.persist(klient2);
//        session.flush();
//        session.close();



    }
}
