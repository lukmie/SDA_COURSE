package com.lukmie.zad3;

import com.lukmie.HibernateUtil;
import com.lukmie.entity.Pracownik;
import com.lukmie.entity.Pracownik2;
import com.lukmie.zad1.DAO;
import org.hibernate.Session;

import java.util.List;

public class PracownikDAO extends DAO<Pracownik2> {

    private Pracownik2 pracownik2 = new Pracownik2();

    @Override
    public void add(Pracownik2 pracownik2) {
        super.add(pracownik2);
    }

    public Pracownik2 select(Integer id) {
        return super.select(id, pracownik2);
    }

    @Override
    public Pracownik2 update(Pracownik2 pracownik2) {
        return super.update(pracownik2);
    }

    public void delete(Integer id) {
        pracownik2.setId(id);
        super.delete(id, pracownik2);
    }

    public List<Pracownik2> findByNazwisko(String nazwisko) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Pracownik2> klientList = session.createNamedQuery("pracownik.findByNazwisko", Pracownik2.class).setParameter("nazwisko", nazwisko).getResultList();
        session.close();
        return klientList;
    }
}
