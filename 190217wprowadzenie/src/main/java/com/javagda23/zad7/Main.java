package com.javagda23.zad7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        File file = new File("output_1.txt");

        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (PrintWriter printWriter = new PrintWriter(new FileWriter("output_1.txt", false))){
            printWriter.println("Hello world!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
