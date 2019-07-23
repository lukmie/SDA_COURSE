package com.lukmie.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(schema = "sklep", name = "kategoria_produktu")
public class KategoriaProduktu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id_kategorii;
    @Column
    private String nazwa;

    @OneToMany(mappedBy = "kategoriaProduktu")
    private List<Produkt> produktList;

    public KategoriaProduktu() {
    }

    public KategoriaProduktu(String nazwa) {
        this.nazwa = nazwa;
    }

    public Integer getId_kategorii() {
        return id_kategorii;
    }

    public void setId_kategorii(Integer id_kategorii) {
        this.id_kategorii = id_kategorii;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public List<Produkt> getProduktList() {
        return produktList;
    }

    public void setProduktList(List<Produkt> produktList) {
        this.produktList = produktList;
    }

    @Override
    public String toString() {
        return "KategoriaProduktuDAO{" +
                "id_kategorii=" + id_kategorii +
                ", nazwa='" + nazwa + '\'' +
                ", produktList=" + produktList +
                '}';
    }
}
