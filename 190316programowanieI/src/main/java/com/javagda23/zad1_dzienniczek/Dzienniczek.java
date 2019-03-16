package com.javagda23.zad1_dzienniczek;

import java.time.LocalDate;
import java.util.*;

public class Dzienniczek {

    private Uczen uczen;

    private Map<Przedmiot, List<Ocena>> oceny = new HashMap<>();

    public Dzienniczek(Uczen uczen) {
        this.uczen = uczen;
    }

    public Uczen getUczen() {
        return uczen;
    }

//    public boolean wstawOcene(Przedmiot przedmiot, Ocena ocena){
//        List<Ocena> ocenyZPrzedmiotu = this.oceny.get(przedmiot);
//        if(ocenyZPrzedmiotu == null){
//            ocenyZPrzedmiotu = new ArrayList<>();
//            this.oceny.put(przedmiot, ocenyZPrzedmiotu);
//        }
//        return ocenyZPrzedmiotu.add(ocena);
//    }

    public List<Ocena> odczytajOceny(Przedmiot przedmiot){
        return this.oceny.computeIfAbsent(przedmiot, p -> new ArrayList<>());
    }

    public boolean wstawOcene(Przedmiot przedmiot, Ocena ocena){
        return odczytajOceny(przedmiot).add(ocena);//jak to dziala mozna spr w doku
    }

    public Ocena odczytanieOceny(Przedmiot przedmiot, TypOceny typOceny) throws BrakOcenyException {
        return odczytajOceny(przedmiot).stream()
                .filter(ocena -> typOceny.equals(ocena.getTypOceny()))
                .sorted(Comparator.comparing(Ocena::getDataOceny))
                .min(Comparator.comparing(Ocena::getDataOceny))
                .orElseThrow(() -> new BrakOcenyException(przedmiot)); //alternatywna wersja do tego co powyzej i findfirst
//                .sorted((ocena1, ocena2) -> ocena1.getDataOceny().compareTo(ocena2.getDataOceny()))
//                .findFirst();
    }

    public Ocena popraw(Przedmiot przedmiot, TypOceny typOceny)throws BrakOcenyException{
        return odczytanieOceny(przedmiot, typOceny).popraw();

    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\n[" + uczen.getImie() + " " + uczen.getNazwisko() + "]");
        oceny.forEach(((przedmiot, oceny) -> {
            builder.append( " \n" + przedmiot);
            oceny.forEach(ocena -> builder.append("\n" + ocena.getTypOceny() + ", " + ocena.getDataOceny() + ", " + ocena.getWartoscOceny()));
        }));
        return builder.toString();
    }
}
