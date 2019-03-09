package com.javagda23.zad5;

import com.javagda23.zad1_zad2.Czlowiek;

public class Main {
    public static void main(String[] args) {
        Czlowiek czlowiek = new Czlowiek();
        //5
        //a
        IJedzacy jawna1 = new JedzacyMetodyInstancji();
        jawna1.jedz(czlowiek, "kanapka");

        //b
        IJedzacy nieJawna1 = new IJedzacy() {
            @Override
            public void jedz(IPotrafiacyJesc potrafiacyJesc, String cos) {
                czlowiek.jedz(cos);
            }
        };
        nieJawna1.jedz(czlowiek, "zupa");

        //c
        IJedzacy lambda1 = (potrafiacyJesc, posilek) -> potrafiacyJesc.jedz(posilek);
        lambda1.jedz(czlowiek, "pierwsze danie");

        //d
        IJedzacy ref1 = IPotrafiacyJesc::jedz;
        ref1.jedz(czlowiek, "drugie danie");
    }
}
