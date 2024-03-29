package com.javagda23.zad7_consumer;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        //1
        Consumer<String> consument = (ciagZnakow) -> System.out.println(ciagZnakow.toUpperCase());

        //2
        consument.accept("test konsumera");
        consument.accept("");
//        consument.accept(null);
//        Stream.of("a", "b").forEach((ciagZnakow) -> System.out.println(ciagZnakow));

        //3
        Consumer<Integer> calkowite = x -> System.out.println(x*x);
        calkowite.accept(3);
        //4
        calkowite.accept(-3);

        //
        Consumer<String> dlugosc = ciagZnakow -> System.out.println(ciagZnakow.length());
//        dlugosc.andThen(consument);

        consument.andThen(dlugosc).accept("sss");

        //6
        Consumer<String> con6 = liczba -> {
            try{
                if (liczba.matches("-?\\d+")){
                    System.out.println(Integer.parseInt(liczba)*Integer.parseInt(liczba));
                } else System.out.println("Not an integer");
//                int i = Integer.parseInt(liczba);
//                System.out.println(i*i);
            } catch (NumberFormatException e){
                System.out.println("Not an integer");
            }
        };
        con6.accept("-222");
        Consumer<String> komponent = consument.andThen(con6);
        komponent.accept("5");



    }
}
