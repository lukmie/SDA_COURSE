package com.javagda23.dodatkowe;

import java.util.Random;
import java.util.Scanner;

public class Rand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę N:");
        int number = Integer.parseInt(sc.nextLine());

        Random r = new Random();


        for (int i = 0; i < number; i++) {
            System.out.println(r.nextInt(50));
        }
        for (int i = 0; i < number; i++) {
            System.out.printf("%.2f%n",r.nextDouble());
        }
        for (int i = 0; i < number; i++) {
            System.out.println(r.nextBoolean());
        }
        System.out.println("Podaj od: ");
        int from1 = Integer.parseInt(sc.nextLine());
        System.out.println("Podaj do: ");
        int to1 = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < number; i++) {
            System.out.println(r.nextInt(to1) + from1);
        }
        System.out.println("Podaj dla doubla od: ");
        int from2 = Integer.parseInt(sc.nextLine());
        System.out.println("Podaj dla doubla do: ");
        int to2 = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < number; i++) {
            System.out.println(from2 + (to2-from2)*r.nextDouble());
        }
    }
}
