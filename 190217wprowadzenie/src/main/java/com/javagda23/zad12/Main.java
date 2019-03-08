package com.javagda23.zad12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File plik = new File("output_1.txt"); // File reprezentuje deskryptor pliku (zbiór informacji o pliku)

        if (!plik.exists()) {
            System.out.println("Plik nie istnieje!");
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("output_1.txt"))) {
            String linia;
            while ((linia = bufferedReader.readLine()) != null) {
                if(!linia.equals("Hello world!")){
                    System.out.println("Zła zawartość pliku!");
                } else{
                    System.out.println("Wszystko jest ok!");
                }
            }
        } catch (IOException e) { // błędy IO - Input Output - file not found
            e.printStackTrace();
        }

    }
}
