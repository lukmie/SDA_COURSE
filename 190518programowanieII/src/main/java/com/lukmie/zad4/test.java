package com.lukmie.zad4;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(10);
        list.add("Paa");
        list.add("Psd");
        list.add("Bsd");
        list.add("Bsd");
        list.add("Bsd");
        list.add("Bsd");
        list.add("Bsd");
        list.add("Bsd");
        list.add("Bsd");
        list.add("Bsd");
        list.add("Bsd");


//        for (String s : list) {
//            if (s.indexOf("P") == 0){
//                continue;
//            }
//            System.out.println(s + " ");
//        }
        System.out.println(list.get(11));

    }
}
