package com.javagda23.zad1;

public class Main {

    public static void main(String[] args) {

        Student st1 = new Student("1", "a", "1", true, new Double[]{1.0, 1.0, 1.0, 1.0, 1.0});
        Student st2 = new Student("2", "b", "2", true, new Double[]{3.0, 2.0, 3.0, 4.0, 5.0});
        Student st3 = new Student("3", "c", "3", true, new Double[]{5.0, 2.0, 3.0, 4.0, 5.0});
        Student st4 = new Student("4", "d", "4", true, new Double[]{3.0, 2.5, 3.5, 4.5, 5.0});
        Student st5 = new Student("5", "e", "4",true, new Double[]{1.0, 2.0, 3.0, 4.0, 5.0});

        Student[] tab = new Student[10];
        tab[0] = st1;
        tab[1] = st2;
        tab[2] = st3;
        tab[3] = st4;
        tab[4] = st5;


//        1.
//        System.out.println(tab[0]);
//        System.out.println(tab[1]);
//        System.out.println(tab[2]);
//        System.out.println(tab[3]);
//        2.
//        for (Student student : tab) {
//            if(student != null){
//                System.out.println(student);
//            }
//        }
//        3
//        System.out.println("***");
//        System.out.println(szukaj(tab, "30"));
//        5
//        double ocena = st2.obliczSredniaStudenta();
        System.out.println(st2.obliczSredniaStudenta());
//        6
        System.out.println(st4.czyZdal());




    }

    private static Student szukaj(Student[] student, String index){
        for (Student st : student) {
            if(st != null && st.getIndex().equals(index)){
                return st;
            }
        }
        System.err.println("Nie znaleziono studenta.");
        return null;

    }
}
