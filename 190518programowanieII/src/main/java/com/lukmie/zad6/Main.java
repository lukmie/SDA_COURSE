package com.lukmie.zad6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        WczytajPlik wczytajPlik = new WczytajPlik();
        File folder = new File("src\\main\\resources\\");

//        File[] files = folder.listFiles();
//
//        for (File file : files) {
//            System.out.println(file.getName().replaceAll("_"," ").replaceAll(".txt",""));
//        }

        Map<String, List<ZadanieQuizowe>> mapa = new HashMap<>();


        File file = new File("src\\main\\resources\\Animals.txt");
        File[] files = folder.listFiles();


        for (int i = 0; i < files.length; i++) {
            File file1 = files[i];
            String kategoria = file1.getName().replaceAll("_", " ").replaceAll(".txt", "");
            mapa.put(kategoria, wczytajPlik.zadaniaDlaKategorii(file1));
        }


        List<ZadanieQuizowe> zadanieQuizowe = wczytajPlik.zadaniaDlaKategorii(file);
//        System.out.println("Category: " + kategoria);
        System.out.println(mapa.get("Animals"));


        Scanner sc = new Scanner(System.in);
        int punkty = 0;

        for (int i = 0; i < 5; i++) {
            int random = new Random().nextInt(zadanieQuizowe.size());
            System.out.println(zadanieQuizowe.get(random).getPytanie());

            Collections.shuffle(zadanieQuizowe.get(random).getOdpowiedzi());
            for (int j = 0; j < zadanieQuizowe.get(random).getOdpowiedzi().size(); j++) {
//                Integer random1 = new Random().nextInt(zadanieQuizowe.get(random).getOdpowiedzi().size());
                System.out.println((j+1) + ": " + zadanieQuizowe.get(random).getOdpowiedzi().get(j));
            }
            System.out.println("Wybierz odpowiedz:");
            String odp = sc.nextLine();
            String poprawnaOdp = zadanieQuizowe.get(random).getOdpowiedzi().get(0);
            if (zadanieQuizowe.get(random).getOdpowiedzi().get(Integer.parseInt(odp)-1) == poprawnaOdp){
                punkty++;
            }
        }

        System.out.println("Score: " + punkty);

    }
}
