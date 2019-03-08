package com.javagda23.zad10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("10030", "3004", "4000", "12355", "12222", "67888",
                "111200", "225355", "2222", "1111", "3546", "138751", "235912"));

//        System.out.println(list.indexOf("138751"));
//        System.out.println(list.contains("67888"));
//        System.out.println(list.contains("67889"));
//        System.out.println(list.remove("67888"));
//        System.out.println(list.remove("67889"));
//        System.out.println(list.contains("67888"));
//        System.out.println(list.contains("67889"));

        for (String s : list) {
            System.out.print(s + " ");
        }

        for (String s : list) {
            System.out.println(s);
        }


    }
}
