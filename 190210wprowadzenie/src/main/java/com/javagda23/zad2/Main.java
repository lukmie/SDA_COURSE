package com.javagda23.zad2;

public class Main {
    public static void main(String[] args) {
        Intrumentalny[] orkiestra = new Intrumentalny[3];
        orkiestra[0] = new Beben();
        orkiestra[1] = new Gitara();
        orkiestra[2] = new Pianino();

        for (Intrumentalny intrumentalny : orkiestra) {
            intrumentalny.graj();
        }

    }
}
