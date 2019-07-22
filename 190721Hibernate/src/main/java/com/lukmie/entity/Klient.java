package com.lukmie.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(schema = "sklep", name = "klient")
public class Klient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id_klient;
    @Column
    private String imie;
    @Column
    private String nazwisko;
    @Column
    private String telefon;

    @ManyToMany
    @JoinTable(name="Klient_Produkt",
            joinColumns=@JoinColumn(name="klient_id"),
            inverseJoinColumns=@JoinColumn(name="produkt_id"))
    private List<Produkt> produktList;

    @OneToOne(mappedBy = "id_adres")
    private Adres adres;

    public Klient() {
    }

    public Klient(String imie, String nazwisko, String telefon) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.telefon = telefon;
    }

    public Integer getId_klient() {
        return id_klient;
    }

    public void setId_klient(Integer id_klient) {
        this.id_klient = id_klient;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public List<Produkt> getProduktList() {
        return produktList;
    }

    public void setProduktList(List<Produkt> produktList) {
        this.produktList = produktList;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    @Override
    public String toString() {
        return "Klient{" +
                "id_klient=" + id_klient +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", telefon='" + telefon + '\'' +
                ", produktList=" + produktList +
                ", adres=" + adres +
                '}';
    }
}