package com.javagda23.zad1;

public class Kalkulator {
    public static int potega(int podstawa, int wykladnik) {
        int wynik = 1;

        for (int i = 0; i < wykladnik; i++) {
            wynik *= podstawa;
        }

        return wynik;
    }

    public static boolean czyLiczbaPodzielnaPrzez(int liczba, int dzielnik) {
        if (dzielnik == 0){
            return false;
        }
        return liczba % dzielnik == 0;
    }
}
