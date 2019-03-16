package com.javagda23.zad7;

import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        AnalizaDanychPracownikow analizaDanych = new AnalizaDanychPracownikow();

        Map<Pracownik, Departament> pracownikDepartamentMap = analizaDanych.metoda4();
        pracownikDepartamentMap.forEach(((pracownik, departament) -> System.out.println(pracownik.getPlec()+ " - " + departament)));

        Map<String, Integer> pracownikPensjaMap = analizaDanych.metoda5();
        pracownikPensjaMap.forEach(((imie, pensja) -> System.out.println(imie + " - " + pensja)));

        Map<Boolean, List<Pracownik>> plecPracownikow = analizaDanych.metoda6();
        plecPracownikow.forEach((czyKobieta, pracownicy) -> {
            System.out.println("Czy kobieta?: " + czyKobieta);
            pracownicy.stream().forEach(pracownik -> System.out.println(pracownik.getImie()));
        });

    }
}
