package com.javagda23.zad7;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        DruzynaPilkarska d1 = new DruzynaPilkarska("d1", 21,11,10,2, 0, 30);
        DruzynaPilkarska d2 = new DruzynaPilkarska("d2", 22,5,2,10, 0, 6);
        DruzynaPilkarska d3 = new DruzynaPilkarska("d3", 12,8,4,10, 0, 14);

        List<DruzynaPilkarska> list = new ArrayList<>();
        list.add(d1);
        list.add(d2);
        list.add(d3);



        Collections.sort(list, new KryteriumPunktow());

        for (DruzynaPilkarska druzynaPilkarska : list) {

            System.out.println(druzynaPilkarska);
        }


    }
}
