package com.javagda23.zad1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CzlonekRodziny matka = new Matka("Anna");
        CzlonekRodziny ojciec = new Ojciec("Adam");
        CzlonekRodziny syn = new Syn("Antoni");
        CzlonekRodziny corka = new Corka("Angela");

        CzlonekRodziny[] tab = new CzlonekRodziny[4];
        tab[0] = matka;
        tab[1] = ojciec;
        tab[2] = syn;
        tab[3] = corka;

        for (CzlonekRodziny czlonekRodziny : tab) {
            if(czlonekRodziny instanceof Ojciec){
                Ojciec o = (Ojciec) czlonekRodziny;
                o.nakrzycz();
            }
            czlonekRodziny.przedstawSie();
            System.out.println(czlonekRodziny.jestDorosly());
        }

    }
}
