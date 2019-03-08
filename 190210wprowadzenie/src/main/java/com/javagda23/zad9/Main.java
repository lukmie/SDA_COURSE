package com.javagda23.zad9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>(Arrays.asList(
                new Student("123", "A", "B", Plec.KOBIETA),
                new Student("124", "B", "C", Plec.MEZCZYZNA),
                new Student("125", "C", "A", Plec.MEZCZYZNA),
                new Student("126", "D", "Z", Plec.MEZCZYZNA)
        ));

//        5a
        System.out.println(list);
//        5b
        System.out.println("***************");
        for (Student student : list) {
            System.out.println(student);
        }
//        5c
        System.out.println("***************");
        for (Student student : list) {
            if(student.getPlec() == Plec.MEZCZYZNA){
                System.out.println(student);
            }
        }
//        5d
        System.out.println("***************");
        for (Student student : list) {
            System.out.println(student.getNumerIndeksu());
        }
    }
}
