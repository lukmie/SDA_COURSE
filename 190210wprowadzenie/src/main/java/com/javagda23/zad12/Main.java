package com.javagda23.zad12;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDateTime aktualnaDataCzas = LocalDateTime.now();
        System.out.println("Data i czas przed formatowaniem: " + aktualnaDataCzas);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String dataCzasPoFormacie = aktualnaDataCzas.format(formatter);
        System.out.println("Data i czas po formatowaniu: " + dataCzasPoFormacie);

        String dataCzasString = "2018-08-19 23:32:00";
        LocalDateTime formatDateTime = LocalDateTime.parse(dataCzasString, formatter);

        System.out.println("Otrzymana data i czas: " + dataCzasString);
        System.out.println("Data i czas obiekt: " + formatDateTime);
        System.out.println("Obiekt po formacie: " + formatDateTime.format(formatter));

    }
}
