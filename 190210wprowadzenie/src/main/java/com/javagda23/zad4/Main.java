package com.javagda23.zad4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Citizen c1 = new King("Arthur");
        Citizen c2 = new Soldier("Yuri");
        Citizen c3 = new Townsman("John");
        Citizen c4 = new Peasant("Will");
        Citizen[] tab = new Citizen[4];
        tab[0] = c1;
        tab[1] = c2;
        tab[2] = c3;
        tab[3] = c4;
        Town t1 = new Town(tab);
        System.out.println(t1.howManyCanVote());
        System.out.println(Arrays.toString(t1.whoCanVote()));

    }
}
