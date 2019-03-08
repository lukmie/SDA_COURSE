package com.javagda23.zad3;

public class Krokodyl implements Jedzacy {
    int i = 0;
    int w = 0;
    @Override
    public void jedz(Pokarm pokarm) {
        if(pokarm.getTypPokarmu() == TypPokarmu.OWOC){
            System.out.println("Nie jadam owocow.");
            return;
        }
        i++;
        w += pokarm.getWaga();
    }

    @Override
    public int ilePosilkowZjedzone() {
        return i;
    }

    @Override
    public int ileGramowZjedzone() {
        return w;
    }
}
