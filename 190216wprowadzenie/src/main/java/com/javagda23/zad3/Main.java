package com.javagda23.zad3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getWiek() > o2.getWiek()) {
                    return -1;
                } else if (o1.getWiek() < o2.getWiek()) {
                    return 1;
                }
                return 0;
            }
        });
    }
}
