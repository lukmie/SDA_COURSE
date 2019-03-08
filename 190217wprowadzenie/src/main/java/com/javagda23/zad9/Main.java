package com.javagda23.zad9;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        File plik = new File("output_3.txt"); // File reprezentuje deskryptor pliku (zbiór informacji o pliku)
        try {
            if (!plik.exists()) {
                plik.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Scanner sc = new Scanner(System.in);

        System.out.println("Wpisz zdanie: ");


        try(PrintWriter printWriter = new PrintWriter(new FileWriter("output_3.txt", true))) {
            String zdanie = sc.nextLine();
            while (!zdanie.equals("quit")){
                zdanie = sc.nextLine();
                printWriter.println(zdanie);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
