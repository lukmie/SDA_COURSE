package com.lukmie.zad1;

import com.lukmie.HibernateUtil;
import com.lukmie.entity.Uzytkownik;
import org.hibernate.Session;

import java.util.List;

public class UzytkownikDAO {

    public void addList(List<Uzytkownik> list) {

    }

    public void addUser(Uzytkownik uzytkownik) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.persist(uzytkownik);
        session.flush();
        session.close();
        System.out.println("Dodano uzytkownika o id = " + uzytkownik.getId() + ".");
    }

    public void addUsers(List<Uzytkownik> listaUzytkownikow) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        for (Uzytkownik uzytkownik : listaUzytkownikow) {
            session.persist(uzytkownik);
        }
        session.flush();
        session.close();
//        System.out.println("Dodano uzytkownika o id = " + uzytkownik.getId() + ".");
    }

    public Uzytkownik findUser(long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Uzytkownik uzytkownik = session.find(Uzytkownik.class, id);
        session.flush();
        session.close();
        System.out.println("Znaleziono uzytkownika o id = " + uzytkownik.getId() + ": imie: " + uzytkownik.getImie() + ", nazwisko: " +uzytkownik.getNazwisko());
        return uzytkownik;
    }

    public void updateUserFirstName(long id, String firstName) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Uzytkownik user = findUser(id);
        user.setImie(firstName);
        session.merge(user);
        session.flush();
        session.close();
        System.out.println("Zaktualizowano uzytkownika o id = " + user.getId() + ".");
    }

    public  void deleteUser(long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Uzytkownik uzytkownikUsuwany = new Uzytkownik();
        uzytkownikUsuwany.setId(id);
        session.delete(uzytkownikUsuwany);
        session.flush();
        session.close();
    }
}
