package com.javagda23.zad11;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String dataUrodzin = "19-09-1990";
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter dateFormatterDeath = DateTimeFormatter.ofPattern("MM-yyyy");

        LocalDate localDateBirdth = LocalDate.parse(dataUrodzin, dateFormatter);
        LocalDate localDateDeath = localDateBirdth.plusYears(100);


        Random generator = new Random();
        int losowaLiczba = generator.nextInt(100);

        System.out.println("witaj");
        Long czas1 = System.currentTimeMillis();

        System.out.println("Podaj plec: k/m");
        if (sc.nextLine().equals("m")) {
            localDateDeath = localDateDeath.minusYears(10);
            System.out.println(localDateDeath);
        }
        System.out.println("Czy palisz: t/n");
        if (sc.nextLine().equals("t")) {
            localDateDeath = localDateDeath.minusYears(9).minusMonths(3);
            System.out.println(localDateDeath);
        }
        System.out.println("Czy zyjesz w stresie: t/n");
        if (sc.nextLine().equals("t")) {
            if(losowaLiczba < 10){
                LocalDate pomocniczaData = localDateBirdth.plusYears(60);
                System.out.println("Umrzesz w: " + pomocniczaData.format(dateFormatterDeath) + ". Mając około " +
                        Period.between(localDateBirdth, pomocniczaData).getYears() + " lat.");
            }
        } else{
            System.out.println("Umrzesz mając " + Period.between(localDateBirdth, localDateDeath).getYears() + " lat " +
                    Period.between(localDateBirdth, localDateDeath).getMonths() + " miesięcy. Przybliżona data: " + localDateDeath.format(dateFormatterDeath));
        }
        Long czas2 = System.currentTimeMillis();
        System.out.println("Straciles " + (czas2 - czas1)/1000 + " sekund.");

    }
}
