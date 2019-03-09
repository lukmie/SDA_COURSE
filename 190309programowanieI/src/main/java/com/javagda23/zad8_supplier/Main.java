package com.javagda23.zad8_supplier;

import com.javagda23.zad1_zad2.Czlowiek;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        //1
        Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();
        System.out.println(supplier.get());

        //2
        Supplier<Integer> random = () -> new Random().nextInt(11);
        System.out.println(random.get());

        //3
        Supplier<Czlowiek> czlowiekSupplier = () -> new Czlowiek();
        czlowiekSupplier.get();
    }
}
