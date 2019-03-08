package com.javagda23.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("formularz"))) {
            String linia;
            while ((linia = bufferedReader.readLine()) != null) {
                if (linia.equalsIgnoreCase("##################################")) {
                    linia = bufferedReader.readLine();
                }
//                linia = bufferedReader.readLine();
                String imie = linia.split("=")[1];

                linia = bufferedReader.readLine();
                String nazwisko = linia.split("=")[1];

                linia = bufferedReader.readLine();
                String wiek = linia.split("=")[1];

                linia = bufferedReader.readLine();
                String wzrost = linia.split("=")[1];

                linia = bufferedReader.readLine();
                String zarobki = linia.split("=")[1];

                linia = bufferedReader.readLine();
                String plec = linia.split("=")[1];

                Plec plecEnum = Plec.valueOf(plec);
                Formularz formularz;
                if (plecEnum == Plec.KOBIETA) {

                    linia = bufferedReader.readLine();
                    String wlosy = linia.split("=")[1];

                    linia = bufferedReader.readLine();
                    String oczy = linia.split("=")[1];

                    formularz = new FormularzKobiety(imie, nazwisko, Integer.parseInt(wiek), Integer.parseInt(wzrost), plecEnum, Integer.parseInt(zarobki), oczy, wlosy);
                } else {

                    linia = bufferedReader.readLine();
                    String wyciska = linia.split("=")[1];
                    formularz = new FormularzMezczyzny(imie, nazwisko, Integer.parseInt(wiek), Integer.parseInt(wzrost), plecEnum, Integer.parseInt(zarobki), Integer.parseInt(wyciska));
                }

            }
        } catch (FileNotFoundException e) {
            System.out.println("Nie ma takiego pliku!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}