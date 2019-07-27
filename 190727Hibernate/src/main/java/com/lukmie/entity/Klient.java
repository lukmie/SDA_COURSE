package com.lukmie.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("klient")
public class Klient extends Firma{

    @Column
    private String telefonKont;

    public String getTelefonKont() {
        return telefonKont;
    }

    public void setTelefonKont(String telefonKont) {
        this.telefonKont = telefonKont;
    }
}
