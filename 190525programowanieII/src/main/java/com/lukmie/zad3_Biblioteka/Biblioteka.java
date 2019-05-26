package com.lukmie.zad3_Biblioteka;

import java.util.ArrayList;
import java.util.List;

public class Biblioteka {
    private List<Ksiazka> zbiorKsiazek;

    public Biblioteka() {
        this.zbiorKsiazek = new ArrayList<>();
    }

    public List<Ksiazka> wszystkieKsiazkiWZbiorze() {
        return zbiorKsiazek;
    }

    public void dodajKsiazke(Ksiazka ksiazka) {
        zbiorKsiazek.add(ksiazka);
    }

    public boolean wypozyczKsiazke(Ksiazka ksiazka) {
        sprawdzWypozyczenieKsiazki(ksiazka);
        boolean flag = false;
        if (zbiorKsiazek.contains(ksiazka)) {
            flag = true;
            ksiazka.ustawCzyWypozyczona(flag);
        } else {
            throw new IllegalArgumentException("Brak ksiazki w zbiorze.");
        }
        return flag;
    }

    public void sprawdzWypozyczenieKsiazki(Ksiazka ksiazka) {
        if (ksiazka.czyWypozyczona() == true){
            throw new IllegalArgumentException("Ksiazka jest wypozyczona.");
        }
    }

    public List<Ksiazka> wszystkieDostepneKsiazki() {
        List<Ksiazka> listaKsiazekDostepnych = new ArrayList<>();
        for (Ksiazka ksiazka : zbiorKsiazek) {
            if (!ksiazka.czyWypozyczona()) {
                listaKsiazekDostepnych.add(ksiazka);
            }
        }
        return listaKsiazekDostepnych;
    }

    public void zwrocKsiazke(Ksiazka ksiazka){
        if (!wszystkieKsiazkiWZbiorze().contains(ksiazka)){
            throw new IllegalArgumentException("Ksiazka nie wystepuje w zbiorze");
        } else {
            ksiazka.ustawCzyWypozyczona(false);
        }
    }

    public void usunKsiazke(Ksiazka ksiazka){
        wszystkieKsiazkiWZbiorze().remove(ksiazka);
    }

    public List<Ksiazka> szukaj(String tekst){
        List<Ksiazka> znalezioneKsiazki = new ArrayList<>();
        for (Ksiazka ksiazka : wszystkieKsiazkiWZbiorze()) {
            if (ksiazka.getTytul().equals(tekst)){
                znalezioneKsiazki.add(ksiazka);
            }
        }
        return znalezioneKsiazki;
    }

    public List<Ksiazka> szukajPoFragmencieTytulu(String tekst){
        List<Ksiazka> znalezioneKsiazki = new ArrayList<>();
        for (Ksiazka ksiazka : wszystkieKsiazkiWZbiorze()) {
            if (ksiazka.getTytul().contains(tekst)){
                znalezioneKsiazki.add(ksiazka);
            }
        }
        return znalezioneKsiazki;
    }
}
