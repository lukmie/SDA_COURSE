package com.javagda23.zad1;

public interface CzlonekRodziny {
    default void przedstawSie(){
        System.out.println("Jestem czlonkiem rodziny");
    }
    boolean jestDorosly();
}
