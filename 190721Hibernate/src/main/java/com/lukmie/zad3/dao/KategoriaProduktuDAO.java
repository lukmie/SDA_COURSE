package com.lukmie.zad3.dao;

import com.lukmie.entity.KategoriaProduktu;

public class KategoriaProduktuDAO extends DAO<KategoriaProduktu>  {

    private KategoriaProduktu kategoriaProduktu = new KategoriaProduktu();

    @Override
    public void add(KategoriaProduktu kategoriaProduktu) {
        super.add(kategoriaProduktu);
    }

    public KategoriaProduktu select(Integer id) {
        return super.select(id, kategoriaProduktu);
    }

    @Override
    public KategoriaProduktu update(KategoriaProduktu kategoriaProduktu) {
        return super.update(kategoriaProduktu);
    }

    public void delete(Integer id) {
        kategoriaProduktu.setId_kategorii(id);
        super.delete(id, kategoriaProduktu);
    }
}
