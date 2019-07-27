package com.lukmie.zad3;

import com.lukmie.HibernateUtil;
import com.lukmie.entity.Klient;
import com.lukmie.entity.Klient2;
import com.lukmie.zad1.DAO;
import org.hibernate.Session;

import java.util.List;

public class KlientDAO extends DAO<Klient2> {

    private Klient2 klient2 = new Klient2();

    @Override
    public void add(Klient2 klient2) {
        super.add(klient2);
    }

    public Klient2 select(Integer id) {
        return super.select(id, klient2);
    }

    @Override
    public Klient2 update(Klient2 klient2) {
        return super.update(klient2);
    }

    public void delete(Integer id) {
        klient2.setId(id);
        super.delete(id, klient2);
    }

    public List<Klient2> findByNazwisko(String nazwisko) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Klient2> klientList = session.createNamedQuery("klient.findByNazwisko", Klient2.class).setParameter("nazwisko", nazwisko).getResultList();
        session.close();
        return klientList;
    }
}
