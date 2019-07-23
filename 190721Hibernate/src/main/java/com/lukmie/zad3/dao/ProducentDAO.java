package com.lukmie.zad3.dao;

import com.lukmie.entity.Producent;

public class ProducentDAO extends DAO<Producent>{

    private Producent producent = new Producent();

    @Override
    public void add(Producent producent) {
        super.add(producent);
    }

    public Producent select(Integer id) {
        return (Producent)super.select(id, producent);
    }

    @Override
    public Producent update(Producent producent) {
        return super.update(producent);
    }

    public void delete(Integer id) {
        producent.setId_producenta(id);
        super.delete(id, producent);
    }
}
