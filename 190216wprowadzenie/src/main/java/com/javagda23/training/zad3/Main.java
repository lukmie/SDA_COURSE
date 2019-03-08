package com.javagda23.training.zad3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<DruzynaPilkarska> tabela = new ArrayList<>(Arrays.asList(
                new DruzynaPilkarska("a", 1.0, 3.0),
                new DruzynaPilkarska("b", 6.0, 10.0),
                new DruzynaPilkarska("c", 2.0, 1.0)
        ));

        Collections.sort(tabela, new ProporcjaComparator());

        for (DruzynaPilkarska druzynaPilkarska : tabela) {
            System.out.println(druzynaPilkarska);
        }

    }
}
