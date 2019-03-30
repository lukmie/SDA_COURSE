package com.javagda23.zad3_sor;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.concurrent.PriorityBlockingQueue;

public class Lekarze {
    private String imie;
    private PriorityBlockingQueue<Pacjent> kolejka;
    private LocalDateTime koniecObslugi;

    public Lekarze(String imie, PriorityBlockingQueue<Pacjent> kolejka, LocalDateTime koniecObslugi) {
        this.imie = imie;
        this.kolejka = kolejka;
        this.koniecObslugi = koniecObslugi;
    }

    public void obsluzPacjenta() throws InterruptedException {
        Pacjent pacjent = kolejka.take();
        long czasObslugi = (new Random().nextInt(5)+5)*1000;
        System.out.println("Lekarz " + imie + " przyjmuje pacjenta " + pacjent);
        Thread.sleep(czasObslugi);
        System.out.println("Lekarz " + imie + " przyjal pacjenta " + pacjent + " czas obslugi " + czasObslugi);
    }

    public void obsluzPacjentow() throws InterruptedException {
        while (LocalDateTime.now().isBefore(koniecObslugi) || LocalDateTime.now().isAfter(koniecObslugi) && !kolejka.isEmpty()){
            this.obsluzPacjenta();
            Thread.sleep((new Random().nextInt(5)+1)*1000);
        }
    }


}
