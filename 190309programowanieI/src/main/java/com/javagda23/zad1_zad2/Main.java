package com.javagda23.zad1_zad2;

import com.javagda23.zad1_zad2._I_mowiacy.IMowiacy;
import com.javagda23.zad1_zad2._I_mowiacy.MowiacyMetodyStatycznej;
import com.javagda23.zad1_zad2._I_mowiacy.ZiewajacyMetody;

public class Main {
    public static void main(String[] args) {
        //1
        //a
        IMowiacy jawna = new MowiacyMetodyStatycznej();
        jawna.powiedzCos();

        //b
        IMowiacy wLocie = new IMowiacy() {
            @Override
            public void powiedzCos() {
                Czlowiek.zerknijNa("sd");
            }
        };
        wLocie.powiedzCos();

        //c
        IMowiacy lambda = () -> Czlowiek.przywitajSie();
        lambda.powiedzCos();

        //d
        IMowiacy methodRef = Czlowiek::przywitajSie;
        methodRef.powiedzCos();

        //2
        //a
        IMowiacy jawna2 = new ZiewajacyMetody();
        jawna2.powiedzCos();

        //b
        Czlowiek czlowiek = new Czlowiek();
        IMowiacy wLocie2 = new IMowiacy() {
            @Override
            public void powiedzCos() {
                new Czlowiek().ziewnij();
            }
        };
        wLocie2.powiedzCos();

        //c
        IMowiacy lambda2 = () -> new Czlowiek().ziewnij();
        lambda2.powiedzCos();

        //d
        IMowiacy methodRef2 = czlowiek::ziewnij;
        methodRef2.powiedzCos();

        //e
        IMowiacy methodRef2_2 = new Czlowiek()::ziewnij;
        methodRef2_2.powiedzCos();


    }
}
