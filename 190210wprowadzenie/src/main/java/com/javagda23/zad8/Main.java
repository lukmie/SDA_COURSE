package com.javagda23.zad8;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        List<Integer> listInteger = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            listInteger.add(random.nextInt(100));
        }

        int sum = 0;

        for (Integer integer : listInteger) {
            sum += integer;
        }
        System.out.println("Sum: " + sum);

        System.out.println("Average: " + sum/listInteger.size());

//        Collections.sort(listInteger);

        if(listInteger.size() % 2 == 0){
            System.out.println("Median: " +
                    (listInteger.get(listInteger.size()/2 - 1) + listInteger.get(listInteger.size()/2))/2.0);
        } else {
            System.out.println("Media: " + listInteger.get(listInteger.size()/2));
        }
        System.out.println(listInteger);
        int max = listInteger.get(0);
        int min = listInteger.get(0);
        int index = 0;
        for (int i = 0; i < listInteger.size(); i++) {
            if(max < listInteger.get(i)){
                max = listInteger.get(i);
                index  = i;
            }
            if(min > listInteger.get(i)){
                min = listInteger.get(i);
                index = i;
            }

        }
        System.out.println("Maximum: " + max + " index: " + index);
        System.out.println("Minimum: " + min + " index: " + index);

        for (int i = 0; i < listInteger.size(); i++) {
            if(max < listInteger.get(i)){
                max = listInteger.get(i);
            }
        }
        System.out.println("Maximum " + max + " by indexOf " + listInteger.indexOf(max));


    }
}
