package com.javagda23.zad13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File plik = new File("output_2.txt"); // File reprezentuje deskryptor pliku (zbiór informacji o pliku)

        if (!plik.exists()) {
            System.out.println("Plik nie istnieje!");
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("output_2.txt"))) {
            String linia;
            while ((linia = bufferedReader.readLine()) != null) {
                System.out.println(linia.toUpperCase());
                System.out.println(linia.toLowerCase());
                System.out.println(linia.trim());
            }
        } catch (IOException e) { // błędy IO - Input Output - file not found
            e.printStackTrace();
        }
    }
}
