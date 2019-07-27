package com.lukmie.zad1;

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
        klient.setId(id);
        super.delete(id, klient);
    }
}
