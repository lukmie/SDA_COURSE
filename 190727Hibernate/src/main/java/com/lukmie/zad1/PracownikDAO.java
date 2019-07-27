package com.lukmie.zad1;

import com.lukmie.entity.Pracownik;

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
}
