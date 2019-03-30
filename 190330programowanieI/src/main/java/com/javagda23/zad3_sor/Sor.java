package com.javagda23.zad3_sor;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.concurrent.PriorityBlockingQueue;

public class Sor {
    public void start(int czasDzialania){
        LocalDateTime start = LocalDateTime.now();
        LocalDateTime koniecObslugi = start.plusSeconds(20);

        Comparator<Pacjent> poStanie = Comparator.comparing(Pacjent::getPriorytetStanu);
        Comparator<Pacjent> poCzasie = Comparator.comparing(Pacjent::getCzasPrzyjecia);

        PriorityBlockingQueue<Pacjent> kolejka = new PriorityBlockingQueue<>(5, poStanie.thenComparing(poCzasie));
    }
}
