package com.javagda23.zad1_zad2.I_mowiacy;

import com.javagda23.zad1_zad2.Czlowiek;

public class MowiacyMetodyInstancji implements IMowiacy {
    @Override
    public void powiedzCos() {
        new Czlowiek().ziewnij();
    }
}
