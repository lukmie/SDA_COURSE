package com.javagda23.zad3_sor;

import java.time.LocalDateTime;

public class Pacjent {
    private Stan stan;
    private Integer numer;
    private LocalDateTime czasPrzyjecia;

    public Pacjent(Integer numer) {
        this.stan = Stan.losujStan();
        this.numer = numer;
        this.czasPrzyjecia = LocalDateTime.now();
    }

    public Integer getPriorytetStanu(){
        return stan.getWartosc();
    }

    public Stan getStan() {
        return stan;
    }

    public Integer getNumer() {
        return numer;
    }

    public LocalDateTime getCzasPrzyjecia() {
        return czasPrzyjecia;
    }

    @Override
    public String toString() {
        return "Pacjent{" +
                "stan=" + stan +
                ", numer=" + numer +
                ", czasPrzyjecia=" + czasPrzyjecia +
                '}';
    }
}
