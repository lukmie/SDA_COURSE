package com.lukmie.entity;

import javax.persistence.*;

@Entity
@DiscriminatorValue("pracownik")
@NamedQueries({@NamedQuery(name = "pracownik.findByNazwisko", query = "SELECT p FROM Pracownik p WHERE p.nazwisko=:nazwisko")})
public class Pracownik extends Firma{

    @Column
    private String stanowisko;
    @Column
    private Double wynagrodzenie;

    public Pracownik(String nazwaFirmy, String imie, String nazwisko, String stanowisko, Double wynagrodzenie) {
        super(nazwaFirmy, imie, nazwisko);
        this.stanowisko = stanowisko;
        this.wynagrodzenie = wynagrodzenie;
    }

    public Pracownik() {
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }

    public Double getWynagrodzenie() {
        return wynagrodzenie;
    }

    public void setWynagrodzenie(Double wynagrodzenie) {
        this.wynagrodzenie = wynagrodzenie;
    }

    @Override
    public String toString() {
        String result = "Klient: imie=" + super.getImie() + ", nazwisko=" + super.getNazwisko() + ", wynagrodzenie=" + wynagrodzenie;
        return result;
    }
}
