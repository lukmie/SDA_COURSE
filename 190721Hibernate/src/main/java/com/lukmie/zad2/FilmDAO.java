package com.lukmie.zad2;


import com.lukmie.HibernateUtil;
import com.lukmie.entity.Film;
import org.hibernate.Session;

import java.util.List;

public class FilmDAO {

    public Film findByIdCreateQuery(long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Film znalezionyFilm = session.createQuery("FROM Film WHERE id=:id", Film.class).setParameter("id", id).getSingleResult();
        session.close();
        return znalezionyFilm;
    }

    public List<Film> findAllCreateQuery() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Film> znalezionyFilm = session.createQuery("FROM Film", Film.class).getResultList();
        session.close();
        znalezionyFilm.forEach(System.out::println);
        return znalezionyFilm;
    }

    public Film findByIdCreateNativeQuery(long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Film znalezionyFilm = session.createNativeQuery("SELECT * FROM Film WHERE id=:id", Film.class).setParameter("id", id).getSingleResult();
        session.close();
        return znalezionyFilm;
    }

    public List<Film> findAllCreateNativeQuery() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Film> znalezionyFilm = session.createNativeQuery("SELECT * FROM Film", Film.class).getResultList();
        session.close();
        znalezionyFilm.forEach(System.out::println);
        return znalezionyFilm;
    }

    public Film findByIdCreateNamedQuery(long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Film znalezionyFilm = session.createNamedQuery("film.selectById", Film.class).setParameter("id", id).getSingleResult();
        session.close();
        return znalezionyFilm;
    }

    public List<Film> findAllCreateNamedQuery() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Film> znalezionyFilm = session.createNamedQuery("film.selectAll", Film.class).getResultList();
        session.close();
        znalezionyFilm.forEach(System.out::println);
        return znalezionyFilm;
    }

    public Film findByNazwaCreateNamedQuery(String nazwa_filmu) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Film znalezionyFilm = session.createNamedQuery("film.selectByNazwa", Film.class).setParameter("nazwa", nazwa_filmu).getSingleResult();
        session.close();
        return znalezionyFilm;
    }

    public List<Film> findByGatunekCreateNamedQuery(String gatunek_filmu) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Film> znalezionyFilm = session.createNamedQuery("film.selectByGatunek", Film.class).setParameter("gatunek_filmu", gatunek_filmu).getResultList();
        session.close();
        return znalezionyFilm;
    }

    public List<Film> findByRezyserCreateNamedQuery(String rezyser_filmu) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Film> znalezionyFilm = session.createNamedQuery("film.selectByRezyser", Film.class).setParameter("gatunek_filmu", rezyser_filmu).getResultList();
        session.close();
        return znalezionyFilm;
    }

    public Film findByRokProdukcjiCreateNamedQuery(int rokprodukcji) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Film znalezionyFilm = session.createNamedQuery("film.selectByRezyser", Film.class).setParameter("rokprodukcji", rokprodukcji).getSingleResult();
        session.close();
        return znalezionyFilm;
    }



}
