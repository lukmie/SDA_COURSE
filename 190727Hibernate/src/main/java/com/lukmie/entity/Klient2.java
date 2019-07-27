package com.lukmie.entity;

import javax.persistence.*;

@Entity
@Table(name = "klient2")
@NamedQueries({@NamedQuery(name = "klient.findByNazwisko", query = "SELECT k FROM Klient2 k WHERE k.nazwisko=:nazwisko")})
public class Klient2 extends MainEntity{

    @Column
    private String telefonKont;

    public String getTelefonKont() {
        return telefonKont;
    }

    public void setTelefonKont(String telefonKont) {
        this.telefonKont = telefonKont;
    }
}

