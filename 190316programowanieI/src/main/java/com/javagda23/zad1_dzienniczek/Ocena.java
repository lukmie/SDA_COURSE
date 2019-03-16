package com.javagda23.zad1_dzienniczek;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Ocena {
    private TypOceny typOceny;
    private LocalDateTime dataOceny;
    private Integer wartoscOceny; //w domu int na enum
    private Przedmiot przedmiot;

    public Ocena(TypOceny typOceny, Integer wartoscOceny, Przedmiot przedmiot) {
        this.typOceny = typOceny;
        this.dataOceny = LocalDateTime.now();
        this.wartoscOceny = wartoscOceny;
        this.przedmiot = przedmiot;
    }

    public TypOceny getTypOceny() {
        return typOceny;
    }

    public LocalDateTime getDataOceny() {
        return dataOceny;
    }

    public Integer getWartoscOceny() {
        return wartoscOceny;
    }

    public Przedmiot getPrzedmiot() {
        return przedmiot;
    }

    public Ocena popraw(){
        this.wartoscOceny += 1;
        this.dataOceny = LocalDateTime.now();
        return this;
    }

    @Override
    public String toString() {
        return "Ocena{" +
                "typOceny=" + typOceny +
                ", dataOceny=" + dataOceny +
                ", wartoscOceny=" + wartoscOceny +
                ", przedmiot=" + przedmiot +
                '}';
    }
}
