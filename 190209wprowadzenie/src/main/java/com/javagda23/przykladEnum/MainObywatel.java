package com.javagda23.przykladEnum;

import java.util.Scanner;

public class MainObywatel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Plec plec = null;
        do {
            try {
                System.out.println("Podaj plec: ");
                plec = Plec.valueOf(sc.nextLine().toUpperCase().trim());
            } catch (IllegalArgumentException iae) {
                System.err.println("Podaj plec poprawnie.");
            }
        }while (plec == null);

        System.out.println("Podaj imie: ");
        String imie = sc.nextLine();

        System.out.println("Podaj nazwisko: ");
        String nazwisko = sc.nextLine();

        System.out.println("Podaj pesel: ");
        int pesel = Integer.parseInt(sc.nextLine());

        Obywatel o1 = new Obywatel(plec, imie, nazwisko, pesel);
        System.out.println(o1);

    }
}
