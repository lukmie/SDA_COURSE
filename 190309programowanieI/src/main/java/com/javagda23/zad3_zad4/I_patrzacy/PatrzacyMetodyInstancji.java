package com.javagda23.zad3_zad4.I_patrzacy;

import com.javagda23.zad1_zad2.Czlowiek;

public class PatrzacyMetodyInstancji implements IPatrzacy {
    @Override
    public void patrzNa(String cos) {
        new Czlowiek().przygladajSie(cos);
    }
}
