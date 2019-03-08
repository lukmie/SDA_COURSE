package com.javagda23.zad7;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> list = new ArrayList<>();

        System.out.println("Podaj 5 wartosci do listy: ");
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextLine());
        }

        System.out.println(list);

        Random r = new Random();
        int i = r.nextInt(50);
        List<Integer> list1 = new ArrayList<>(Arrays.asList(
                r.nextInt(50),
                r.nextInt(50),
                r.nextInt(50),
                r.nextInt(50),
                r.nextInt(50)));

        System.out.println(list1);
    }
}
