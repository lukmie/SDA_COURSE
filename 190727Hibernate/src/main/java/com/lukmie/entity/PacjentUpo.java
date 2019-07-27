package com.lukmie.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table//(name = "pacjent_upo")
@NamedQueries({@NamedQuery(name = "pacjentUpo.findByPesel", query = "SELECT p FROM PacjentUpo p WHERE p.pesel=:pesel")})
public class PacjentUpo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;
    @Column
    private String imie;
    @Column
    private String nazwisko;
    @Column
    private Integer pesel;
    @Embedded
    private Upowazniony upowaznionyI;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "imieUpoI", column = @Column(name = "imieUpoII")),
            @AttributeOverride(name = "nazwiskoUpoI", column = @Column(name = "nazwiskoUpoII")),
            @AttributeOverride(name = "nrDowoduUpoI", column = @Column(name = "nrDowoduUpoII")),
            @AttributeOverride(name = "dataDodaniaUpoI", column = @Column(name = "dataDodaniaUpoII"))
    })
    private Upowazniony upowaznionyII;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "imieUpoI", column = @Column(name = "imieUpoIII")),
            @AttributeOverride(name = "nazwiskoUpoI", column = @Column(name = "nazwiskoUpoIII")),
            @AttributeOverride(name = "nrDowoduUpoI", column = @Column(name = "nrDowoduUpoIII")),
            @AttributeOverride(name = "dataDodaniaUpoI", column = @Column(name = "dataDodaniaUpoIII"))
    })
    private Upowazniony upowaznionyIII;

    public PacjentUpo() {
    }

    public PacjentUpo(String imie, String nazwisko, Integer pesel) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getPesel() {
        return pesel;
    }

    public void setPesel(Integer pesel) {
        this.pesel = pesel;
    }

    public Upowazniony getUpowaznionyI() {
        return upowaznionyI;
    }

    public void setUpowaznionyI(Upowazniony upowaznionyI) {
        this.upowaznionyI = upowaznionyI;
    }

    public Upowazniony getUpowaznionyII() {
        return upowaznionyII;
    }

    public void setUpowaznionyII(Upowazniony upowaznionyII) {
        this.upowaznionyII = upowaznionyII;
    }

    public Upowazniony getUpowaznionyIII() {
        return upowaznionyIII;
    }

    public void setUpowaznionyIII(Upowazniony upowaznionyIII) {
        this.upowaznionyIII = upowaznionyIII;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PacjentUpo that = (PacjentUpo) o;
        return id.equals(that.id) &&
                imie.equals(that.imie) &&
                nazwisko.equals(that.nazwisko) &&
                pesel.equals(that.pesel) &&
                upowaznionyI.equals(that.upowaznionyI) &&
                upowaznionyII.equals(that.upowaznionyII) &&
                upowaznionyIII.equals(that.upowaznionyIII);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, imie, nazwisko, pesel, upowaznionyI, upowaznionyII, upowaznionyIII);
    }
}
