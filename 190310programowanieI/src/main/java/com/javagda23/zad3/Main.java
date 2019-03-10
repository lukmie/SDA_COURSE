package com.javagda23.zad3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        final Path path = Paths.get("produkty.txt");
        Stream<String> lines = Files.lines(path);
        lines
                .map(ciag -> ciag.split(";")[1])
                .filter(nazwaO -> nazwaO.endsWith("o"))
                .forEach(System.out::println);
//        Stream<String> names = lines.filter(name -> name.endsWith("o")); zapisane jak wyzej tylko innym sposobem

    }
}
