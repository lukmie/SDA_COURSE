package com.lukmie.zad2;

import com.lukmie.HibernateUtil;
import com.lukmie.entity.Uzytkownik;
import org.hibernate.Session;

public class Main {
    public static void main(String[] args) {
        FilmDAO filmDAO = new FilmDAO();

//        System.out.println(filmDAO.findByIdCreateQuery(1L));
//        System.out.println(filmDAO.findByIdCreateNativeQuery(1L));
//        System.out.println(filmDAO.findByIdCreateNamedQuery(1L));
//        filmDAO.findAllCreateQuery();
//        filmDAO.findAllCreateNativeQuery();
//        filmDAO.findAllCreateNamedQuery();
        System.out.println(filmDAO.findByNazwaCreateNamedQuery("Rambo"));
        System.out.println(filmDAO.findByGatunekCreateNamedQuery("akcja"));
        System.out.println(filmDAO.findByRokProdukcjiCreateNamedQuery(2000));
        System.out.println(filmDAO.findByRezyserCreateNamedQuery("Adam Nowak"));


    }
}
