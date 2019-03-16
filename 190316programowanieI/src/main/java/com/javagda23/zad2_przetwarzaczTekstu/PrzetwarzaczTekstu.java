package com.javagda23.zad2_przetwarzaczTekstu;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrzetwarzaczTekstu {
    private String ciagZnakow;

    public PrzetwarzaczTekstu(String ciagZnakow) {
        this.ciagZnakow = ciagZnakow;
    }

    //1
    public Map<String, Long> przetworzMetoda1(){
        return Arrays.stream(ciagZnakow.replace(", "," ").replace(". "," ").split(" "))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    //2
    public void przetworzMetoda2(){
        przetworzMetoda1()
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> System.out.println(e.getKey() + " -> " + e.getValue()));

    }

    //3
    public void przetworzMetoda3(){
        przetworzMetoda1()
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Long> comparingByValue().reversed())
                .forEach(e -> System.out.println(e.getKey() + " -> " + e.getValue()));
    }

    //4
    public void przetworzMetoda4(){
        przetworzMetoda1()
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .sorted(Map.Entry. <String, Long> comparingByValue().reversed())
                .forEach(e -> System.out.println(e.getKey() + " -> " + e.getValue()));
    }



}
