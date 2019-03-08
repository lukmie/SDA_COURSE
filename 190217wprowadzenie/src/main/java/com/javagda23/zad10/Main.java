package com.javagda23.zad10;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Wpisz ścieżkę: ");

        String zdanie = sc.nextLine();
//        String zdanie;
//        zdanie= "C:\\Users\\Lukasz\\Desktop\\odap.txt";
        File file = new File(zdanie);

        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.length());
        System.out.println(file.canRead());
    }
}
