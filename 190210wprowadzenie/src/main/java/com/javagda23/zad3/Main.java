package com.javagda23.zad3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Pokarm p1 = new Pokarm("jabklo", TypPokarmu.OWOC, 100);
        Pokarm p2 = new Pokarm("kurczak", TypPokarmu.MIESO, 200);
        Pokarm p3 = new Pokarm("wolowina", TypPokarmu.MIESO, 125);
        Pokarm p4 = new Pokarm("chleb", TypPokarmu.PIECZYWO, 1000);

        Jedzacy j1 = new Weganin();
        Jedzacy j2 = new Krokodyl();
        Jedzacy j3 = new Programista();

        Random r = new Random();
        for (int i = 0; i <r.nextInt(10)+1; i++) {
            j1.jedz(p1);
            j1.jedz(p2);
            j1.jedz(p3);
            j1.jedz(p4);
            j2.jedz(p1);
            j2.jedz(p2);
            j2.jedz(p3);
            j2.jedz(p4);
            j3.jedz(p1);
            j3.jedz(p2);
            j3.jedz(p3);
            j3.jedz(p4);
        }
        Jedzacy[] tab = new Jedzacy[2];
        tab[0] = j1;
        tab[1] = j3;

        for (Jedzacy jedzacy : tab) {
            System.out.println(jedzacy.getClass().getSimpleName() + " " + jedzacy.ileGramowZjedzone() + " " + jedzacy.ilePosilkowZjedzone());
//            System.out.println(j3.getClass() + " " + j3.ileGramowZjedzone() + " " + j3.ilePosilkowZjedzone());
        }



    }
}
