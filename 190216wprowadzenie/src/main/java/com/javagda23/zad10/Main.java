package com.javagda23.zad10;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String request;
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        boolean quit = true;

        do {
            System.out.println("Podaj date/time/datetime: ");
            request = sc.nextLine();
            switch (request) {
                case "date":
                    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM*dd*yyyy");
                    System.out.println("Dzisiejsza data to: " + localDate.format(dateTimeFormatter));
                    break;
                case "time":
                    System.out.println("Dzisiejsza data to: " + localTime);
                    break;
                case "datetime":
                    System.out.println("Dzisiejsza data to: " + localDateTime);
                    break;
                default:
                    System.out.println("see you!");
            }
        } while (!request.equals("quit"));

        System.out.println("Data 10 dni temu: " + localDate.minusDays(10));
        System.out.println("Data za 10 dni: " + localDate.plusDays(10));

        Period period = Period.between(LocalDate.now(), localDate.plusDays(100));
        System.out.println("years: " + period.getYears() + " months: " + period.getMonths() + " days: " + period.getDays());

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("Podaj pierwsza date w formacie : dd-MM-yyyy ");
        LocalDate wynikData1 = LocalDate.parse(sc.nextLine(), dateTimeFormatter);

        System.out.println("Podaj druga date w formacie : dd-MM-yyyy ");
        LocalDate wynikData2 = LocalDate.parse(sc.nextLine(), dateTimeFormatter);

        System.out.println("Roznica wynosi: " );
        Period period2 = Period.between(wynikData1, wynikData2);
        System.out.println("years: " + period2.getYears() + " months: " + period2.getMonths() + " days: " + period2.getDays());

        LocalDate localDate1 = LocalDate.parse("19-09-1990", dateTimeFormatter);
        Period period3 = Period.between(localDate1, LocalDate.now());
        System.out.println("Od urodzin minelo: ");
        System.out.println("years: " + period3.getYears() + " months: " + period3.getMonths() + " days: " + period3.getDays());

    }
}
