package com.lukmie.zad3.dao;

import com.lukmie.entity.Produkt;

public class ProduktDAO extends DAO<Produkt> {

    private Produkt produkt = new Produkt();

    @Override
    public void add(Produkt produkt) {
        super.add(produkt);
    }

    public Produkt select(Integer id) {
        return super.select(id, produkt);
    }

    @Override
    public Produkt update(Produkt produkt) {
        return super.update(produkt);
    }

    public void delete(Integer id) {
        produkt.setId_produktu(id);
        super.delete(id, produkt);
    }
}
