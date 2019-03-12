package com.javagda23.zad7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static com.javagda23.zad7.Departamenty.HR;
import static com.javagda23.zad7.Departamenty.IT;
import static com.javagda23.zad7.Departamenty.KSIEGOWOSC;

public class Main {
    public static void main(String[] args) {
        List<Pracownik> listaPracownikow = new ArrayList<>(Arrays.asList(
                new Pracownik("TOMEK", Plec.M, KSIEGOWOSC, 4000),
                new Pracownik("ZOSIA", Plec.K, KSIEGOWOSC, 4500),
                new Pracownik("JANEK", Plec.M, IT, 8000),
                new Pracownik("ANNA", Plec.K, IT, 12000),
                new Pracownik("KUBA", Plec.M, IT, 4000),
                new Pracownik("MONIKA", Plec.K, HR, 5000)
        ));

        long o = listaPracownikow.stream()
                .collect(Collectors.counting());
        System.out.println(o);



    }
}
