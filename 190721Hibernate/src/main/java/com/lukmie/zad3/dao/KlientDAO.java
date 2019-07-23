package com.lukmie.zad3.dao;

import com.lukmie.entity.Klient;

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
        klient.setId_klient(id);
        super.delete(id, klient);
    }
}
