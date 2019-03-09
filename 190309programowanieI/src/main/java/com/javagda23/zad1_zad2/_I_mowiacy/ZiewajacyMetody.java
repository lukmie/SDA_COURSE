package com.javagda23.zad1_zad2._I_mowiacy;

import com.javagda23.zad1_zad2.Czlowiek;

public class ZiewajacyMetody implements IMowiacy {
    @Override
    public void powiedzCos() {
        new Czlowiek().ziewnij();
    }
}
