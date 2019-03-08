package com.javagda23.zad4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>(Arrays.asList(
         new Person("a", "b",22),
         new Person("v", "a",21),
         new Person("c", "c",20)
        ));
        for (Person person : list) {
            System.out.println(person);
        }

        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getWiek() < o2.getWiek()) {
                    return -1;
                } else if (o1.getWiek() > o2.getWiek()) {
                    return 1;
                }
                return 0;
            }
        });

        System.out.println("Sortowanie");
        for (Person person : list) {
            System.out.println(person);
        }


    }
}
