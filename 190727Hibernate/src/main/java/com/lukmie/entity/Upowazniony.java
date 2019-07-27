package com.lukmie.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.sql.Date;
import java.util.Objects;

@Embeddable
public class Upowazniony {

    @Column
    private String imieUpoI;
    @Column
    private String nazwiskoUpoI;
    @Column
    private String nrDowoduUpoI;
    @Column
    private Date dataDodaniaUpoI;

    public Upowazniony() {
    }

    public Upowazniony(String imieUpoI, String nazwiskoUpoI, String nrDowoduUpoI) {
        this.imieUpoI = imieUpoI;
        this.nazwiskoUpoI = nazwiskoUpoI;
        this.nrDowoduUpoI = nrDowoduUpoI;
    }

    public String getImieUpoI() {
        return imieUpoI;
    }

    public void setImieUpoI(String imieUpoI) {
        this.imieUpoI = imieUpoI;
    }

    public String getNazwiskoUpoI() {
        return nazwiskoUpoI;
    }

    public void setNazwiskoUpoI(String nazwiskoUpoI) {
        this.nazwiskoUpoI = nazwiskoUpoI;
    }

    public String getNrDowoduUpoI() {
        return nrDowoduUpoI;
    }

    public void setNrDowoduUpoI(String nrDowoduUpoI) {
        this.nrDowoduUpoI = nrDowoduUpoI;
    }

    public Date getDataDodaniaUpoI() {
        return dataDodaniaUpoI;
    }

    public void setDataDodaniaUpoI(Date dataDodaniaUpoI) {
        this.dataDodaniaUpoI = dataDodaniaUpoI;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Upowazniony that = (Upowazniony) o;
        return imieUpoI.equals(that.imieUpoI) &&
                nazwiskoUpoI.equals(that.nazwiskoUpoI) &&
                nrDowoduUpoI.equals(that.nrDowoduUpoI);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imieUpoI, nazwiskoUpoI, nrDowoduUpoI);
    }
}
