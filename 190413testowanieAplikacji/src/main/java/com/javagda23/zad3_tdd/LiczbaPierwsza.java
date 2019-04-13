package com.javagda23.zad3_tdd;

public class LiczbaPierwsza {

    public static boolean czyPierwsza(int liczba) {

        if (liczba < 2){
            return false;
        }

        for (int i = 2; i < liczba; i++) {
            if (liczba % i == 0){
                return false;
            }
        }
        return true;
    }
}
