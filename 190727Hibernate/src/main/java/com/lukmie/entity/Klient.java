package com.lukmie.entity;

import javax.persistence.*;

@Entity
@DiscriminatorValue("klient")
@NamedQueries({@NamedQuery(name = "klient.findByNazwisko", query = "SELECT k FROM Klient k WHERE k.nazwisko=:nazwisko")})
public class Klient extends Firma{

    @Column
    private String telefonKont;

    public Klient() {
    }

    public Klient(String nazwaFirmy, String imie, String nazwisko, String telefonKont) {
        super(nazwaFirmy, imie, nazwisko);
        this.telefonKont = telefonKont;
    }

    public String getTelefonKont() {
        return telefonKont;
    }

    public void setTelefonKont(String telefonKont) {
        this.telefonKont = telefonKont;
    }

    @Override
    public String toString() {
        String result = "Klient: imie=" + super.getImie() + ", nazwisko=" + super.getNazwisko() + ", numer kontaktowy=" + telefonKont;
        return result;
    }
}
