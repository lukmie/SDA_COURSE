package com.javagda23.zad2D;

import java.util.List;
import java.util.Optional;

public class Parking {
    private List<MiejsceParkingowe> miejscaParkingowe;
    private boolean czyOtwarty;

    public Parking(List<MiejsceParkingowe> miejscaParkingowe, boolean czyOtwarty) {
        this.miejscaParkingowe = miejscaParkingowe;
        this.czyOtwarty = czyOtwarty;
    }

    public List<MiejsceParkingowe> getMiejscaParkingowe() {
        return miejscaParkingowe;
    }

    public boolean czyOtwarty() {
        return czyOtwarty;
    }

    public boolean sprawdzZajetoscMiejsca(int numerMiejsca) {
        if(!(numerMiejsca > miejscaParkingowe.size()-1)) {
            if(miejscaParkingowe.get(numerMiejsca).getStanMiejsca() == StanMiejsca.WOLNE){
                return true;
            }
        }
        System.out.println("Za duzy numer");
            return false;

    }

//    public Optional<Boolean> sprawdzZajetoscMiejsca(int numerMiejsca){
//        if(miejscaParkingowe.get(numerMiejsca).getStanMiejsca() == StanMiejsca.WOLNE){
//            return Optional.of(true);
//        } else return Optional.empty();
//    }

    public boolean zajmijMiejsce(int numerMiejsca) {
        if (sprawdzZajetoscMiejsca(numerMiejsca)) {
            miejscaParkingowe.get(numerMiejsca).setStanMiejsca(StanMiejsca.ZAJETE);
            System.out.println("Zajęto miejsce nr " + numerMiejsca);
            return true;
        } else
            return false;
    }
}
