package com.javagda23.zad6Pliki;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // File nie służy do zapisu/odczytu z pliku

        File plik = new File("plik1.txt"); // File reprezentuje deskryptor pliku (zbiór informacji o pliku)
        try {
            if (!plik.exists()) {
                plik.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // zapis
        try (PrintWriter printWriter = new PrintWriter(new FileWriter("plik2.txt", true))){
            printWriter.println("def");
        } catch (IOException e) {
            e.printStackTrace();
        }


        //odczyt
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("plik2.txt"))) {
            String linia;
            while ((linia = bufferedReader.readLine()) != null) {
                System.out.println(linia);
            }
        } catch (IOException e) { // błędy IO - Input Output - file not found
            e.printStackTrace();
        }


        try (Scanner scanner = new Scanner(new FileReader("plik2.txt"))) {
            // dopóki jest jakaś linia w pliku
            while (scanner.hasNextLine()) {
                // wypisz ją
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }
    }
}
