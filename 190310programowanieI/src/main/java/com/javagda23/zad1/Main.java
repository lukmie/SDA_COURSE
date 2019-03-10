package com.javagda23.zad1;

import java.util.Random;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        String string = "abcdefghijklmoprstuwxyz";

//        Stream.generate(string.indexOf(2));
        Stream<Character> losowaLitera = Stream.generate(() -> {
            int pozycja = random.nextInt(string.length());
            return string.charAt(pozycja);
        });
        losowaLitera
                .limit(10)
                .sorted()
                .forEach(System.out::println);

        Stream.generate(() -> {
            int pozycja = random.nextInt(string.length());
            return string.charAt(pozycja);
        })
                .limit(10)
                .sorted()
                .forEach(System.out::print);

    }
}
