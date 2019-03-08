package com.javagda23.zad3;

public class Weganin implements Jedzacy {
    private int i = 0;
    private int w = 0;
    @Override
    public void jedz(Pokarm pokarm) {
        if(pokarm.getTypPokarmu() == TypPokarmu.MIESO){ //.equals potencjalnie moze zwrocic nullPointerException
            System.out.println("Nie jadam miesa.");
        } else{
            i++;
            w += pokarm.getWaga();
        }
    }

    @Override
    public int ilePosilkowZjedzone() {
        return i;
    }

    @Override
    public int ileGramowZjedzone() {
        return w;
    }

    @Override
    public String toString() {
        return "Weganin{" +
                "i=" + i +
                ", w=" + w +
                '}';
    }
}
