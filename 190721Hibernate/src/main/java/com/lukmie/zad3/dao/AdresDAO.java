package com.lukmie.zad3.dao;

import com.lukmie.entity.Adres;

public class AdresDAO extends DAO<Adres> {

    private Adres adres = new Adres();

    @Override
    public void add(Adres adres) {
        super.add(adres);
    }

    public Adres select(Integer id) {
        return super.select(id, adres);
    }

    @Override
    public Adres update(Adres adres) {
        return super.update(adres);
    }

    public void delete(Integer id) {
        adres.setId_adres(id);
        super.delete(id, adres);
    }
}
