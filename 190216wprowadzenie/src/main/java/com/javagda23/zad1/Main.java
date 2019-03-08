package com.javagda23.zad1;

public class Main {
    public static void main(String[] args) {
        Garaz<Samochod> garaz = new Garaz<Samochod>();
        Samochod s1 = new Samochod("ford", "mondeo", "red");
        Samochod s2 = new Samochod("ford", "ka", "blue");
        Samochod s3 = new Samochod("foderd", "ka", "blue");
        BMW bmw = new BMW("a", "s");
        garaz.zaparkuj(s1);
        garaz.zaparkuj(bmw);
        System.out.println(garaz.wyprowadz(s3));
        garaz.zaparkuj(s3);
    }
}
