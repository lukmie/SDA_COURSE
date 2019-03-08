package com.javagda23.zad11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student(new ArrayList<>(
                Arrays.asList(3.0, 5.0, 5.5, 5.5)), "123", "A", "B");

        List<Student> listaGr23 = new ArrayList<>(Arrays.asList(student1));

        Dziennik d1 = new Dziennik(listaGr23);

        double srednia = d1.podajSredniaStudenta("123");

        System.out.println("Srednia wynosi: " + srednia);
    }
}
