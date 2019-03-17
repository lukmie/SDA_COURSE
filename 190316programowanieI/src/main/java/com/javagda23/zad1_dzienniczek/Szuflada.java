package com.javagda23.zad1_dzienniczek;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Szuflada {
    private Map<String, List<Dzienniczek>> przegroda = new HashMap<>();

    public Szuflada() {
    }

    public Szuflada(Map<String, List<Dzienniczek>> przegroda) {
        this.przegroda = przegroda;
    }

    public void wlozDzienniczek(Dzienniczek dzienniczek){
        this.przegroda.computeIfAbsent(dzienniczek.getUczen().getNazwisko().substring(0,1), litera -> new ArrayList<>()).add(dzienniczek);
    }

    public List<Dzienniczek> metoda1(String litera){
        return przegroda.get(litera);
//        return przegroda.entrySet()
//                .stream()
//                .filter(l -> l.equals(litera))
//                .map()
    }

    public List<Ocena> metoda2(Przedmiot przedmiot, String litera){
        List<Dzienniczek> dzienniczki = this.metoda1(litera);
//        dzienniczki.stream().flatMap()              //funkcja przyjmuje dzieniczek i chcemy zwrocic strumien ocen
        Stream<Ocena> strumienOcenZDzienniczkowWDanejPrzegrodce = this.metoda1(litera).stream().flatMap(dz-> dz.odczytajOceny(przedmiot).stream());
        return this.metoda1(litera)
                .stream()
                .flatMap(dzienniczek -> dzienniczek.odczytajOceny(przedmiot).stream()) // to jest narazie list i co chcemy z tym zrobic -> otrzymać strumien
                .collect(Collectors.toList());
    }

    private Stream<Dzienniczek> getWszystkieDzienniczkiZSzuflady() {
        return this.przegroda
                .values()
                .stream()
                .flatMap(Collection::stream);
    }

    public long metoda3(Przedmiot przedmiot){
//        Stream<List<Dzienniczek>> stream = this.przegroda.values().stream();
//        Stream<Dzienniczek> wszystkieDzienniczkiZSzuflady = stream.flatMap(listaDzienniczkow -> listaDzienniczkow.stream());
//        Stream<Ocena> ocenaStream = wszystkieDzienniczkiZSzuflady.flatMap(dzienniczek -> dzienniczek.odczytajOceny(przedmiot).stream());
        return getWszystkieDzienniczkiZSzuflady()//splaszczenie do jednej listy dzienniczkow
                .flatMap(dzienniczek -> dzienniczek.odczytajOceny(przedmiot).stream())//wszyyystkie oceny z szuflady
                .count();
    }

    //czy kazdy uczen to niby co samo co czy kazdy dzienniczek/?? why
    public boolean metoda4(Przedmiot przedmiot){
        return getWszystkieDzienniczkiZSzuflady()//splaszczenie do jednej listy dzienniczkow
                .allMatch(dzienniczek -> !dzienniczek.odczytajOceny(przedmiot).isEmpty());
    }

    public boolean metoda5(String imie){
        return getWszystkieDzienniczkiZSzuflady()
                .anyMatch(dzienniczek -> dzienniczek.getUczen().getImie().equals(imie));
    }

    public boolean metoda6(Przedmiot przedmiot){
        return getWszystkieDzienniczkiZSzuflady()
                .noneMatch(dzienniczek -> dzienniczek.odczytajOceny(przedmiot).isEmpty());//na zajeciach allmatch - spr
    }

    public Optional<Integer> metoda7(Przedmiot przedmiot, KlasaSzkolna klasaSzkolna){
        return getWszystkieDzienniczkiZSzuflady()
                .filter(dzienniczek -> dzienniczek.getUczen().getKlasaSzkolna().equals(klasaSzkolna))//to sprawia że juz mamy tylko przefiltrowane wartości z danej klasy
                .flatMap(dzienniczek-> dzienniczek.odczytajOceny(przedmiot).stream())//a tu strumień tylko tych ocen
                .min(Comparator.comparing(Ocena::getWartoscOceny))
                .map(Ocena::getWartoscOceny);//zmapuj mi optionala na innego optionala i mamy wartosc oceny
    }

    public OptionalDouble metoda8(Przedmiot przedmiot, TypOceny typOceny){
        return getWszystkieDzienniczkiZSzuflady()
                .flatMap(dzienniczek -> dzienniczek.odczytajOceny(przedmiot).stream())//mamy wszystkie oceny
                .filter(ocena -> ocena.getTypOceny().equals(typOceny))
                .mapToInt(Ocena::getWartoscOceny)
                .average();
    }

    public Optional<Integer> metoda9(int liczbaPrzedmiotow){
        return getWszystkieDzienniczkiZSzuflady()
                .filter(dzienniczek -> dzienniczek.przedmioty().size() > liczbaPrzedmiotow)
                .flatMap(dz -> dz.odczytajOceny().stream())
                .max(Comparator.comparing(Ocena::getWartoscOceny))
                .map(Ocena::getWartoscOceny); //zmapujemy na wartość sobie
    }

    public Collection<Uczen> metoda10(double srednia){
        return getWszystkieDzienniczkiZSzuflady()
                .filter(dzienniczek -> dzienniczek.sredniaOcen().getAsDouble() < srednia)//zabezpieczyć jak double nie ma wartości, jest nullem. np w dzienniczku ifem i moze zwrocic zero
                //mamy tu dzienniczki i zamienic dzienniczka na ucznia a to przy pomocy mapy jak nizej
                .map(Dzienniczek::getUczen)
                .collect(Collectors.toList());
    }//11 podzial na 2 etapy
}
