package com.lukmie.zad7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/main/resources/quiz/Animals.txt");

        List<ZadanieQuizowe> zadaniaDlaKategorii = wczytajZadaniaZPliku(file);

    }

    private static List<ZadanieQuizowe> wczytajZadaniaZPliku(File file) throws FileNotFoundException {
        List<ZadanieQuizowe> zadaniaDlaKategorii = new ArrayList<ZadanieQuizowe>();
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String pytanie = scanner.nextLine();
            String iloscOdpowiedzi = scanner.nextLine();
            //System.out.println("Treśc pytania: " + pytanie);
            //System.out.println("Ilosć odpowiedzi: " + iloscOdpowiedzi);
            int iloscOdp = Integer.parseInt(iloscOdpowiedzi);
            List<String> odpowiedzi = new ArrayList<String>();
            for (int i = 0; i < iloscOdp; i++) {
                String odpowiedz = scanner.nextLine();
                //System.out.println("Odpowiedź " + i + ": " + odpowiedz);
                odpowiedzi.add(odpowiedz);
            }

            ZadanieQuizowe zadanie = new ZadanieQuizowe(pytanie, odpowiedzi);
            zadaniaDlaKategorii.add(zadanie);
        }
        return zadaniaDlaKategorii;
    }
}
