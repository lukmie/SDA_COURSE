package com.javagda23.zad9_date_time;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        Date date = new Date();
//        System.out.println(date);

//        Date date1 = new Date(date.getYear(), date.getMonth(), date.getDay()+5);
        // pobranie obecnej data + godzina i przypisanie do zmiennej
        LocalDateTime localDateTime = LocalDateTime.now();

        // pobranie obecnej daty i przypisanie do zmiennej
        LocalDate localDate = LocalDate.now();
        LocalDate wynik = localDate.minusDays(5);

        // pobranie obecnej godziny i przypisanie do zmiennej
        LocalTime localTime = LocalTime.now();

//        Timestamp - czas wyrażony w milisekundach od 1 stycznia 1970 roku.
        Long czas = System.currentTimeMillis();



        // Okres czasu - wyrażony w latach

        // okres od bitwy pod grunwaldem
        Period period = Period.between(LocalDate.of(1410, 7, 14), localDate);
        System.out.println(period);
        System.out.println("Period: " + period.getYears() + " lat, " + period.getMonths() + " miesiecy, " +
                period.getDays() + " dni.");



        // czas od rozpoczęcia zajęć.
        Duration duration = Duration.between(LocalDateTime.of(2019, 2, 14, 9, 0), localDateTime);
        System.out.println(duration);
        System.out.println("Duration: " + duration.getSeconds() / 60);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
        System.out.println();

        // wypisanie w zadanym formacie:
        String tekstowo = localDateTime.format(dateTimeFormatter);
        System.out.println("Wypisanie w zadanym formacie: " + tekstowo);

        // z tekstu na date
        LocalDateTime wynikData = LocalDateTime.parse("07-14-1410 12:00:00", dateTimeFormatter);
        System.out.println("Parsowane z tekstu na date w zadanym formacie: " + wynikData);
        System.out.println("Parsowane z tekstu na date w zadanym formacie: " + wynikData.format(dateTimeFormatter));

        // domyślny format Javovy - yyyy-MM-dd'T'HH:mm


    }
}
