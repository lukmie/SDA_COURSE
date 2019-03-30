package com.javagda23.zad3_sor;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.concurrent.PriorityBlockingQueue;

public class Rejestracja implements Runnable{
    private Integer numerPacjenta;
    private LocalDateTime koniecObslugi;
    private PriorityBlockingQueue<Pacjent> kolejka;

    public Rejestracja(LocalDateTime koniecObslugi, PriorityBlockingQueue<Pacjent> kolejka) {
        this.koniecObslugi = koniecObslugi;
        this.kolejka = kolejka;
    }

    public void rejestrujPacjenta(){
        final Pacjent pacjent = new Pacjent(++numerPacjenta);
        System.out.println("Rejestruje się pacjenta: " + pacjent);
        kolejka.offer(pacjent);
    }

    public void rejestrujPacjentow() throws InterruptedException {
        while(LocalDateTime.now().isBefore(koniecObslugi)){
            rejestrujPacjenta();
            Thread.sleep((new Random().nextInt(5)+1)*1000);
        }
    }

    @Override
    public void run() {
        try {
            this.rejestrujPacjentow();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
