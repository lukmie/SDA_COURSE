package com.javagda23.zad7;

import java.util.Arrays;
import java.util.List;

import static com.javagda23.zad7.Departamenty.HR;
import static com.javagda23.zad7.Departamenty.IT;
import static com.javagda23.zad7.Departamenty.KSIEGOWOSC;
import static com.javagda23.zad7.Plec.M;
import static com.javagda23.zad7.Plec.K;

public class Pracownicy {
    public static final Pracownik TOMEK = new Pracownik("TOMEK", M, KSIEGOWOSC, 3000);

    public static final Pracownik ZOSIA = new Pracownik("ZOSIA", K, KSIEGOWOSC, 3500);

    public static final Pracownik JANEK = new Pracownik("JANEK", M, IT, 8000);

    public static final Pracownik ANNA = new Pracownik("ANNA", K, IT, 12000);

    public static final Pracownik KUBA = new Pracownik("KUBA", M, IT, 4000);

    public static final Pracownik MONIKA = new Pracownik("MONIKA", K, HR, 5000);



    public static final List<Pracownik> PRACOWNICY =

            Arrays.asList(MONIKA, TOMEK, JANEK, ANNA, ZOSIA, KUBA);
}
