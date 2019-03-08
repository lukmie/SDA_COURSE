package com.javagda23.zad5;

public class Main {
    public static void main(String[] args) {
        RejestrObywateli rejestrObywateli = new RejestrObywateli();
        rejestrObywateli.dodajObywatela("90099001218", "s", "n");
        rejestrObywateli.dodajObywatela("93099001218", "z", "c");
        rejestrObywateli.dodajObywatela("94099001218", "z", "c");
        rejestrObywateli.dodajObywatela("95099001218", "z", "c");
        rejestrObywateli.dodajObywatela("96099001218", "z", "c");
//        try {
//            System.out.println(rejestrObywateli.znajdzObywateliUrodzonychPrzed(1989));
//        } catch (NoSuchObywatelException e) {
//            e.printStackTrace();
//        }
        

        System.out.println(rejestrObywateli.znajdzObywateliPoPeselu( "90099001218"));

    }
}
