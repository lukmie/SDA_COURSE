package com.lukmie.zad1;

import com.lukmie.HibernateUtil;
import org.hibernate.Session;

public abstract class DAO<T> {

    public void add(T object) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.persist(object);
        session.flush();
        session.close();
    }

    public T select(Integer id, T object) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        T theObject = (T)session.find(object.getClass(), id);
        session.flush();
        session.close();
        return theObject;
    }

    public T update(T object) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        T theObject = (T)session.merge(object);
        session.flush();
        session.close();
        return theObject;
    }

    public void delete(Integer id, Object object) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(object);
        session.flush();
        session.close();
    }

}
