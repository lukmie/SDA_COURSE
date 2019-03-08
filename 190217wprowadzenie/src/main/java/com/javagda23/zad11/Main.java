package com.javagda23.zad11;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        File plik = new File("output_form.txt"); // File reprezentuje deskryptor pliku (zbiór informacji o pliku)
        try {
            if (!plik.exists()) {
                plik.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Scanner sc = new Scanner(System.in);
        String zdanie;

        Formularz formularz = new Formularz();
        Formularz formularzK = new FormularzK();
        Formularz formularzM = new FormularzM();

        try(PrintWriter printWriter = new PrintWriter(new FileWriter("output_form.txt", false))) {
            do {
                System.out.println("Podaj wiek: ");
                formularz.setWiek(Integer.parseInt(sc.nextLine()));
                System.out.println("Podaj wzrost: ");
                formularz.setWzrost(Integer.parseInt(sc.nextLine()));
                System.out.println("Podaj plec: ");
                formularz.setPlec(Plec.valueOf(sc.nextLine().trim().toUpperCase()));
                System.out.println("Podaj zarobki: ");
                formularz.setZarobki(Integer.parseInt(sc.nextLine()));
                System.out.println("Podaj wage: ");
                formularz.setWaga(Double.parseDouble(sc.nextLine()));

                if(formularz.getPlec() == Plec.MEZCZYZNA){
                    System.out.println("Zarost: ");
                    ((FormularzM) formularzM).setZarost(sc.nextLine());
                } else {
                    System.out.println("Rodzaj wlosow: ");
                    ((FormularzM) formularzM).setZarost(sc.nextLine());
                }
                printWriter.println(formularz.toString() + formularzM.toString());
                System.out.println("Zakończyć działanie programu? T/N");
                zdanie = sc.nextLine().toUpperCase();
            } while (zdanie.equals("N"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
