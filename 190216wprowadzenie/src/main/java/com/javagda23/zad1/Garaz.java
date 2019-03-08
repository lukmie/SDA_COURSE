package com.javagda23.zad1;

import java.util.Optional;

public class Garaz<T extends Samochod> {//T extends Samochod by nie wpakować czegoś innego np stringa
    private T miejsceSamPierwsze;
    private T miejsceSamDrugie;

    public Garaz() {
    }

    public void zaparkuj(T auto){
        if(miejsceSamPierwsze == null){
            System.out.println("Zaparkowany, miejsce 1");
            miejsceSamPierwsze = auto;
            return;
        } else if(miejsceSamDrugie == null){
            System.out.println("Zaparkowany, miejsce 2");
            miejsceSamDrugie = auto;
            return;
        } else {
            System.out.println("Brak miejsca w garażu.");
        }
    }

    public Optional<T> wyprowadz(T auto){
        if(miejsceSamPierwsze == auto){
            System.out.println("Zwracam auto z miejsca 1.");
            miejsceSamPierwsze = null;
            return Optional.of(auto);
        }
        if(miejsceSamDrugie == auto){
            System.out.println("Zwracam auto z miejsca 1.");
            miejsceSamDrugie = null;
            return Optional.of(auto);
        }
        return Optional.empty();

    }
}
