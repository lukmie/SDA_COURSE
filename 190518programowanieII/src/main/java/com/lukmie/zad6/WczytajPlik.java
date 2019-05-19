package com.lukmie.zad6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.List;

public class WczytajPlik {
    private List<ZadanieQuizowe> zadaniaDlaKategorii = new ArrayList<>();

    public List<ZadanieQuizowe> zadaniaDlaKategorii(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String pytanie = scanner.nextLine();
            String iloscOdpowiedzi = scanner.nextLine();
            List<String> listaOdpowiedzi = new ArrayList<>();

            for (int i = 0; i < Integer.parseInt(iloscOdpowiedzi); i++) {
                listaOdpowiedzi.add(scanner.nextLine());
            }

            ZadanieQuizowe zadanieQuizowe = new ZadanieQuizowe(pytanie, listaOdpowiedzi);
            zadaniaDlaKategorii.add(zadanieQuizowe);

        }
//        System.out.println(zadaniaDlaKategorii);

        return zadaniaDlaKategorii;
    }

}
