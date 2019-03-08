package com.javagda23.zad4;

public class Main {
    public static void main(String[] args) {
//        Student st1 = new Student(123L, "a", "e");
//        Student st2 = new Student(124L, "b", "f");
//        Student st3 = new Student(125L, "c", "g");
//        Student st4 = new Student(100400L, "z", "x");
//
//        Map<Long, Student> map = new HashMap<>();
//
//        map.put(st1.getNumerIndeksu(), st1);
//        map.put(st2.getNumerIndeksu(), st2);
//        map.put(st3.getNumerIndeksu(), st3);
//        map.put(st4.getNumerIndeksu(), st4);
//
//        System.out.println(map.containsKey(100200L));
//        System.out.println(map.get(100400L));
//        System.out.println(map.size());

        University university = new University();
        university.addStudent("a", "d");
        university.addStudent("as","sa");
//        System.out.println(university.getStudent(1L));
        university.printAllStudents();



    }
}
