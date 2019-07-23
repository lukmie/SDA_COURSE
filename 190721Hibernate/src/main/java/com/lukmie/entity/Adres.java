package com.lukmie.entity;

import javax.persistence.*;

@Entity
@Table(schema = "sklep", name = "adres")
public class Adres {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id_adres;
    @Column
    private String ulica;
    @Column(name = "nrdomu")
    private Integer nrDomu;
    @Column(name = "nrmieszkania")
    private Integer nrMieszkania;
    @Column(name = "kod_pocztowy")
    private String kodPocztowy;
    @Column
    private String miescowosc;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "klient_id", unique = true)
    private Klient klient;

    public Adres() {
    }

    public Adres(String ulica, Integer nrDomu, Integer nrMieszkania, String kodPocztowy, String miescowosc) {
        this.ulica = ulica;
        this.nrDomu = nrDomu;
        this.nrMieszkania = nrMieszkania;
        this.kodPocztowy = kodPocztowy;
        this.miescowosc = miescowosc;
    }

    public Integer getId_adres() {
        return id_adres;
    }

    public void setId_adres(Integer id_adres) {
        this.id_adres = id_adres;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public Integer getNrDomu() {
        return nrDomu;
    }

    public void setNrDomu(Integer nrDomu) {
        this.nrDomu = nrDomu;
    }

    public Integer getNrMieszkania() {
        return nrMieszkania;
    }

    public void setNrMieszkania(Integer nrMieszkania) {
        this.nrMieszkania = nrMieszkania;
    }

    public String getKodPocztowy() {
        return kodPocztowy;
    }

    public void setKodPocztowy(String kodPocztowy) {
        this.kodPocztowy = kodPocztowy;
    }

    public String getMiescowosc() {
        return miescowosc;
    }

    public void setMiescowosc(String miescowosc) {
        this.miescowosc = miescowosc;
    }

    public Klient getKlient() {
        return klient;
    }

    public void setKlient(Klient klient) {
        this.klient = klient;
    }

    @Override
    public String toString() {
        return "Adres{" +
                "id_adres=" + id_adres +
                ", ulica='" + ulica + '\'' +
                ", nrDomu=" + nrDomu +
                ", nrMieszkania=" + nrMieszkania +
                ", kodPocztowy='" + kodPocztowy + '\'' +
                ", miescowosc='" + miescowosc + '\'' +
                ", klient=" + klient +
                '}';
    }
}
