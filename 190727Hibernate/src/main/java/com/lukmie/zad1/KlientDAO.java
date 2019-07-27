package com.lukmie.zad1;

import com.lukmie.HibernateUtil;
import com.lukmie.entity.Klient;
import org.hibernate.Session;

import java.util.List;

public class KlientDAO extends DAO<Klient> {

    private Klient klient = new Klient();

    @Override
    public void add(Klient klient) {
        super.add(klient);
    }

    public Klient select(Integer id) {
        return super.select(id, klient);
    }

    @Override
    public Klient update(Klient klient) {
        return super.update(klient);
    }

    public void delete(Integer id) {
        klient.setId(id);
        super.delete(id, klient);
    }

    public List<Klient> findByNazwisko(String nazwisko) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Klient> klientList = session.createNamedQuery("klient.findByNazwisko", Klient.class).setParameter("nazwisko", nazwisko).getResultList();
        session.close();
        return klientList;
    }
}
