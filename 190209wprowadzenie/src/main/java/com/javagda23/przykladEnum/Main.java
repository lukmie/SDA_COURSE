package com.javagda23.przykladEnum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Plec zmiennaTypuPlec = Plec.KOBIETA;
//        Komputer k1 = new Komputer(200,"intel", TypProcesora.WIELORDZENIOWY);
//        Komputer k2 = new Komputer(300,"amd", TypProcesora.WIELORDZENIOWY);
//        Komputer k3 = new Komputer(400,"intel", TypProcesora.JEDNORDZENIOWY);
//
//        Komputer[] tab = new Komputer[3];
//        tab[0] = k1;
//        tab[1] = k2;
//        tab[2] = k3;
//
//        for (Komputer k : tab) {
//            System.out.println(k);
//        }
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj moc: ");
        String mocString = sc.nextLine();
        int moc = Integer.parseInt(mocString);

        System.out.println("Podaj nazwe producenta: ");
        String nazwaProducenta = sc.nextLine();


        TypProcesora typ = null;
        do {
            try {
                System.out.println("Podaj typ procesora");
                String typString = sc.nextLine();
                typ = TypProcesora.valueOf(typString.trim().toUpperCase());
            } catch (IllegalArgumentException iae) {
                System.err.println("Nie wpisałeś poprawnego typu procesora.");

            }
        }while (typ == null);

        Komputer komputer = new Komputer(moc, nazwaProducenta, typ);

        System.out.println(komputer);



    }
}
