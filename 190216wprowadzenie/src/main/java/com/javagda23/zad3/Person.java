package com.javagda23.zad3;

public class Person implements Comparable<Person>{
    private String imie;
    private int wiek;

    public Person(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    @Override
    public String toString() {
        return "Person{" +
                "imie='" + imie + '\'' +
                ", wiek=" + wiek +
                '}';
    }

    public int getWiek() {
        return wiek;
    }

    // -1 (this < o)
    // 0 (this == o)
    // 1 (this > o)
    @Override
    public int compareTo(Person o) {
        // kryterium porównania to wiek osoby
        if(wiek > o.wiek){
            return -1;
        }else if(wiek < o.wiek){
            return 1;
        }
        return 0;

        // porównanie długości pola imie.
//        if(imie.length() > o.imie.length()){
//            return 1;
//        }else if(imie.length() < o.imie.length()){
//            return -1;
//        }
//        return 0;
    }
}