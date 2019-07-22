package com.lukmie.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(schema = "sklep", name = "producent")
public class Producent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id_producenta;
    @Column
    private String nazwa;
    @OneToMany(mappedBy = "producent")
    private List<Produkt> produkt;

    public Producent() {
    }

    public Producent(String nazwa) {
        this.nazwa = nazwa;
    }

    public Integer getId_producenta() {
        return id_producenta;
    }

    public void setId_producenta(Integer id_producenta) {
        this.id_producenta = id_producenta;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public List<Produkt> getProdukt() {
        return produkt;
    }

    public void setProdukt(List<Produkt> produkt) {
        this.produkt = produkt;
    }

    @Override
    public String toString() {
        return "Producent{" +
                "id_producenta=" + id_producenta +
                ", nazwa='" + nazwa + '\'' +
                ", produkt=" + produkt +
                '}';
    }
}
