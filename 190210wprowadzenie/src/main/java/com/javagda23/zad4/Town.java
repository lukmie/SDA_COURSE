package com.javagda23.zad4;

import java.util.Arrays;
import java.util.Objects;

public class Town {
    private Citizen[] tab;
    private int i = 0;

    public Town(Citizen[] tab) {
        this.tab = tab;
    }

    public int howManyCanVote(){
        for (Citizen citizen : tab) {
            if(citizen.canVote()){
                i++;
            }
        }
        return i;
    }

    public Citizen[] whoCanVote(){
        Citizen[] c = new Citizen[howManyCanVote()];
        int i = 0;
        for (Citizen citizen : tab) {
            if(citizen.canVote()){
                c[i++] = citizen;
            }
        }
        return c;
    }




//    public Citizen[] whoCanVote() {
//        Citizen[] zdolniDoGlosowania = new Citizen[howManyCanVote()];
//
//        int pozycjaNaKtoraWstawiam = 0;
//        for (Citizen citizen : tab) {
//            if (citizen.canVote()) {
//                zdolniDoGlosowania[pozycjaNaKtoraWstawiam++] = citizen;
//            }
//        }
//
//        return zdolniDoGlosowania;
//    }
}
