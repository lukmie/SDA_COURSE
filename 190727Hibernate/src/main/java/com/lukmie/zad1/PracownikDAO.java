package com.lukmie.zad1;

import com.lukmie.HibernateUtil;
import com.lukmie.entity.Klient;
import com.lukmie.entity.Pracownik;
import org.hibernate.Session;

import java.util.List;

public class PracownikDAO extends DAO<Pracownik> {

    private Pracownik pracownik = new Pracownik();

    @Override
    public void add(Pracownik pracownik) {
        super.add(pracownik);
    }

    public Pracownik select(Integer id) {
        return super.select(id, pracownik);
    }

    @Override
    public Pracownik update(Pracownik pracownik) {
        return super.update(pracownik);
    }

    public void delete(Integer id) {
        pracownik.setId(id);
        super.delete(id, pracownik);
    }

    public List<Pracownik> findByNazwisko(String nazwisko) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Pracownik> klientList = session.createNamedQuery("pracownik.findByNazwisko", Pracownik.class).setParameter("nazwisko", nazwisko).getResultList();
        session.close();
        return klientList;
    }
}
