package com.javagda23.zad3;

public class Programista implements Jedzacy {
    int i = 0;
    int w = 0;
    @Override
    public void jedz(Pokarm pokarm) {
        if(pokarm.getTypPokarmu() == TypPokarmu.NABIAL && pokarm.getTypPokarmu() == TypPokarmu.PIECZYWO){
            System.out.println("Nie jem pieczywa i nabialu");
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
