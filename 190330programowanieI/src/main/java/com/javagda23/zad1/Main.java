package com.javagda23.zad1;



import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        int rozmiar = 10000000;

//        try {
        metoda1(rozmiar, linkedList);
//            Thread.sleep(20000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        metoda1(rozmiar, arrayList);

//        metoda2(500, linkedList);
//        metoda2(500, arrayList);
//        metoda3(200, linkedList);
//        metoda3(200, arrayList);
        metoda4(200, linkedList);
        metoda4(200, arrayList);

    }

    public static void metoda1(int rozmiar, List<Integer> list){
        final long start = System.currentTimeMillis();
        for (int i = 0; i < rozmiar; i++) {
            list.add(i);
        }
        final long end = System.currentTimeMillis();
        System.out.println(list.getClass().getSimpleName() + ": "  + (end - start));
    }

    public static void metoda2(int iloscElementow, List<Integer> list){
        final long start = System.currentTimeMillis();
        for (int i = 0; i < iloscElementow ; i++) {
//            list.get(list.size()/2);
//            System.out.println(i);
            list.get(list.size()/2 + i);
        }
        final long end = System.currentTimeMillis();
        System.out.println(list.getClass().getSimpleName() + ": "  + (end - start));
    }

    public static void metoda3(int iloscElementow, List<Integer> list){
        final long start = System.currentTimeMillis();
        for (int i = 0; i < iloscElementow; i++) {
            list.add(list.size()/2,-100);
        }
//        System.out.println(list);
        final long end = System.currentTimeMillis();
        System.out.println(list.getClass().getSimpleName() + ": "  + (end - start));
    }

    public static void metoda4(int iloscElementow, List<Integer> list){
        final long start = System.currentTimeMillis();
        for (int i = 0; i < iloscElementow; i++) {
            list.add(0,-100);
        }
//        System.out.println(list);
        final long end = System.currentTimeMillis();
        System.out.println(list.getClass().getSimpleName() + ": "  + (end - start));
    }
}
