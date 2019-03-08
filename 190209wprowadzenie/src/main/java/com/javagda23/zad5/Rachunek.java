package com.javagda23.zad5;

import java.util.Arrays;

public class Rachunek {
//    Rachunek[] tab;
    Produkt[] tab;

    public Rachunek(Produkt[] tab) {
        this.tab = tab;
    }

//    public Rachunek[] getTab() {
//        return tab;
//    }

    public void wypiszRachunek(){
        for (Produkt r: tab) {
            System.out.println(r);
        }
    }

    public double sumaNetto(){
        double sum = 0.0;
        for (Produkt r: tab) {
            sum += r.getCenaNetto();
        }
        return sum;
    }

    public double sumaBrutto(){
        double sum = 0.0;
        for (Produkt r: tab) {
            sum += r.podajCeneBrutto();
        }
        return sum;
    }

    public double roznica(){
        double sum = 0.0;
        for (Produkt r: tab) {
            sum = r.podajCeneBrutto() - r.getCenaNetto();
        }
        return sum;
    }

//    @Override
//    public String toString() {
//        return "Rachunek{" +
//                "tab=" + Arrays.toString(tab) +
//                '}';
//    }
}
