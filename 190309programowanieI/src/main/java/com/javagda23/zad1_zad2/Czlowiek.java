package com.javagda23.zad1_zad2;

import com.javagda23.zad5.IPotrafiacyJesc;

public class Czlowiek implements IPotrafiacyJesc {
    private String imie;

    public Czlowiek() {
        System.out.println("Tworzę człowieka!");
    }

    public Czlowiek(String imie) {
        this.imie = imie;
    }

    public static void przywitajSie() {
        System.out.println("Cześć - metoda statyczna");
    }

    public static void zerknijNa(String cos) {
        System.out.println("Zerkam na: " + cos + " - metoda statyczna.");
    }

    public void ziewnij() {
        System.out.println("aaaaaaaaa - metoda instancji");
    }

    public void przygladajSie(String czemus) {
        System.out.println("Przygladam się: " + czemus + "- metoda instancji.");
    }

    @Override
    public void jedz(String cos) {
        System.out.println("Zjadlem " + cos);
    }
}
