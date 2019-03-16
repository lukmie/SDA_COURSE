package com.javagda23.zad6;

import com.sun.org.apache.xpath.internal.operations.Bool;
import javafx.geometry.Pos;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static final Post POST_1 = new Post("Java 8 wprowadza strumienie",
            "java 8,strumienie", 519,
            new Komentarz("Super!"),
            new Komentarz("Leniwe przetwarzanie, mega :)"));

    public static final Post POST_2 = new Post("Nowe API dla plików NIO",
            "java 8,file api,nio api", 7220);

    public static final Post POST_3 = new Post("Przetwarzanie równoległe strumieni",
            "JAVA 8,STRUMIENIE", 3125,
            new Komentarz("WOW!"));

    public static final Post POST_4 = new Post("NullPointerException? Poznaj Optional",
            "java 8,null pointer exception,optional", 3125,
            new Komentarz("No, teraz to będę miał problem z głowy"));

    public static final List<Post> POSTY =
            Arrays.asList(POST_1, POST_2, POST_3, POST_4);

    public static void metoda1() {
        POSTY.stream()
                .peek(post -> System.out.println(post.getTemat()))
                .collect(Collectors.toList());
    }

    public static List<Post> metoda2() {
        return POSTY.stream()
//                .sorted((post1, post2) -> Integer.compare(post1.getLiczbaZnakow(), post2.getLiczbaZnakow()))
                .sorted(Comparator.comparingInt(Post::getLiczbaZnakow))
                .collect(Collectors.toList());
    }

    public static List<Post> metoda3() {
        return POSTY.stream()
                .limit(2)
                .collect(Collectors.toList());
    }

    public static List<Post> metoda4() { //tu by zadzialac z map to musi w liscie List<String>
        return POSTY.stream()
//                .map(post -> post.getTemat())
                .skip(POSTY.size() - 2)
                .collect(Collectors.toList());
    }

    public static List<Post> metoda5() {
        return POSTY.stream()
                .filter(post -> post.getLiczbaZnakow() < 500)
                .collect(Collectors.toList());
    }

    public static List<Post> metoda6() {
        return POSTY.stream()
                .filter(post -> post.getTemat().contains("Java"))
                .collect(Collectors.toList());
    }

    public static Boolean metoda7() {
        return POSTY.stream()
                .allMatch(post -> post.getTemat().contains("a"));
    }

    public static Boolean metoda8() {
        return POSTY.stream()
                .anyMatch(post -> post.getLiczbaZnakow() > 5000);
    }

    public static Boolean metoda9() {
        return POSTY.stream()
                .noneMatch(post -> post.getTag().trim().split(",").length > 5);
    }

    public static Optional<Post> metoda10() {
        return POSTY.stream()
                .filter(post -> post.getTemat().contains("Java"))
                .findFirst();
    }

    public static Optional<Post> metoda11() {
        return POSTY.stream()
                .filter(post -> post.getTemat().contains("Null"))
                .findAny();
    }

    public static List<String> metoda12(){
        return POSTY.stream()
                .map(post -> post.getTemat())
                .collect(Collectors.toList());
    }

    public static Optional<Integer> metoda13(){
        return POSTY.stream()
                .map(post -> post.getLiczbaZnakow())
//                .reduce((liczbaZnakow1, liczbaZnakow2) -> liczbaZnakow1 + liczbaZnakow2); //to samo co poniżej
                .reduce(Integer::sum);
    }

    public static List<Komentarz> metoda14(){
        return POSTY.stream()
                .flatMap(post -> post.getListaKomentarzy().stream())
                .collect(Collectors.toList());
    }

    public static List<String> metoda15(){
        return POSTY.stream()
                .flatMap(post -> Arrays.stream(post.getTag().toLowerCase().split(",")))
                .distinct()
                .collect(Collectors.toList());
    }


    public static void main(String[] args) {
//        metoda1();
//        metoda2();
        metoda4().forEach(post -> System.out.println(post.getTemat()));
        System.out.println(metoda9());
        metoda10().ifPresent(post -> System.out.println(post.getTemat()));
        System.out.println("sss");
        metoda11().ifPresent(post -> System.out.println(post.getTemat()));
        System.out.println("###########");
        metoda12().forEach(System.out::println);
        metoda12().forEach(post -> System.out.println(post));
        metoda13().ifPresent(post -> System.out.println(post));
        System.out.println(metoda15());
    }
}
