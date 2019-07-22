package com.lukmie.zad3.dao;

import com.lukmie.HibernateUtil;
import org.hibernate.Session;

public abstract class DAO<T> {

    public void addProducent(T object) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.persist(object);
        session.flush();
        session.close();
//        System.out.println("Dodano uzytkownika o id = " + object.getId_producenta() + ".");
    }
}
