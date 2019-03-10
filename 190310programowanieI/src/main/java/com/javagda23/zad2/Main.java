package com.javagda23.zad2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //w domu poprzez generowanie strumienia liczb

//        Stream.generate(()-> new Random().nextInt(100))
//                .limit(10)
//                .filter(liczba -> liczba %2 == 0)
//                .map(la -> la*10)
//                .sorted(Collections.reverseOrder())
//                .forEach(System.out::println);


        Arrays.stream(new Integer[] {1, 20, 32, 45, 62, 65, 77, 79, 81, 90})
                .filter(liczba -> liczba %2 == 0)
                .map(la -> la*10)
                .sorted(Collections.reverseOrder())
                .skip(3)
                .forEach(System.out::println);
    }
}
