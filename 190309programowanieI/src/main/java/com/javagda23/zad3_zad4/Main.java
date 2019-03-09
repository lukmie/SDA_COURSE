package com.javagda23.zad3_zad4;

import com.javagda23.zad1_zad2.Czlowiek;
import com.javagda23.zad3_zad4.I_patrzacy.IPatrzacy;
import com.javagda23.zad3_zad4.I_patrzacy.PatrzacyMetodyInstancji;
import com.javagda23.zad3_zad4.I_patrzacy.PatrzacyMetodyStatycznej;

public class Main {
    public static void main(String[] args) {
        //3
        //a
        IPatrzacy jawna1 = new PatrzacyMetodyStatycznej();
        jawna1.patrzNa("laptopa");

        //b
        IPatrzacy nieJawna1 = new IPatrzacy() {
            @Override
            public void patrzNa(String cos) {
                Czlowiek.zerknijNa(cos);
            }
        };
        nieJawna1.patrzNa("stol");

        //c
        IPatrzacy lambda1 = (przedmiot) -> Czlowiek.zerknijNa(przedmiot);
        lambda1.patrzNa("podloga");

        //d
        IPatrzacy ref1 = Czlowiek::zerknijNa;
        ref1.patrzNa("szafke");

        //4
        //a
        IPatrzacy jawna2 = new PatrzacyMetodyInstancji();
        jawna2.patrzNa("drzwi");

        //b
        Czlowiek czlowiek = new Czlowiek();
        IPatrzacy nieJawna2 = new IPatrzacy() {
            @Override
            public void patrzNa(String cos) {
                new Czlowiek().przygladajSie(cos);
            }
        };
        nieJawna2.patrzNa("klamka");

        //c
        IPatrzacy lambda2 = (przedmiot) -> czlowiek.przygladajSie(przedmiot);
        lambda2.patrzNa("zawias");

        //d
        IPatrzacy ref2 = czlowiek::przygladajSie;
        ref2.patrzNa("szyba");

        //e
        IPatrzacy ref2_2 = new Czlowiek()::przygladajSie;
        ref2_2.patrzNa("framuga");

    }
}
