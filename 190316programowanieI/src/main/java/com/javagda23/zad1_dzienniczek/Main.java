package com.javagda23.zad1_dzienniczek;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Main {
    public static void main(String[] args) {
        Uczen uczen = new Uczen("Marek", "Kafu", KlasaSzkolna.A);

        Dzienniczek dzienniczek = new Dzienniczek(uczen);
        dzienniczek.wstawOcene(Przedmiot.POLSKI, new Ocena(TypOceny.PISEMNA,5, Przedmiot.POLSKI));
        dzienniczek.wstawOcene(Przedmiot.WF, new Ocena(TypOceny.USTNA,5, Przedmiot.WF));
        try{
            System.out.println(dzienniczek.odczytanieOceny(Przedmiot.POLSKI, TypOceny.PISEMNA));
//            dzienniczek.odczytanieOceny(Przedmiot.WF, TypOceny.PISEMNA);
            System.out.println(dzienniczek.popraw(Przedmiot.POLSKI, TypOceny.PISEMNA));
        } catch (BrakOcenyException e){
            System.out.println(e.getMessage());
        }

        System.out.println(dzienniczek);
    }
}
