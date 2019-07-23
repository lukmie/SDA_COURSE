package com.lukmie.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(schema = "sklep", name = "produkt")
public class Produkt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id_produktu;
    @Column
    private String nazwa;
    @Column
    private Double cena;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "producent_id")
    private Producent producent;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "kategoria_id")
    private KategoriaProduktu kategoriaProduktu;

    @ManyToMany(mappedBy = "produktList")
    private List<Klient> klientList;

    public Produkt() {
    }

    public Produkt(String nazwa, Double cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }

    public Integer getId_produktu() {
        return id_produktu;
    }

    public void setId_produktu(Integer id_produktu) {
        this.id_produktu = id_produktu;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Double getCena() {
        return cena;
    }

    public void setCena(Double cena) {
        this.cena = cena;
    }

    public Producent getProducent() {
        return producent;
    }

    public void setProducent(Producent producent) {
        this.producent = producent;
    }

    public KategoriaProduktu getKategoriaProduktu() {
        return kategoriaProduktu;
    }

    public void setKategoriaProduktu(KategoriaProduktu kategoriaProduktu) {
        this.kategoriaProduktu = kategoriaProduktu;
    }

    public List<Klient> getKlientList() {
        return klientList;
    }

    public void setKlientList(List<Klient> klientList) {
        this.klientList = klientList;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "id_produktu=" + id_produktu +
                ", nazwa='" + nazwa +
                ", cena='" + cena +
//                ", producent=" + producent +
//                ", kategoriaProduktu=" + kategoriaProduktu +
                '}';
    }
}
