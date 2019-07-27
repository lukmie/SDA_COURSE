package com.lukmie.entity;

import javax.persistence.*;

@Entity
@Table(name = "pracownik2")
@NamedQueries({@NamedQuery(name = "pracownik.findByNazwisko", query = "SELECT p FROM Pracownik2 p WHERE p.nazwisko=:nazwisko")})
public class Pracownik2 extends MainEntity{

    @Column
    private String stanowisko;
    @Column
    private Double wynagrodzenie;

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
}
