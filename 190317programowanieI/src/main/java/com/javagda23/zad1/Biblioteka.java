package com.javagda23.zad1;

import java.awt.print.Book;
import java.util.*;
import java.util.stream.Collectors;

public class Biblioteka {

    private Map<String, Ksiazka> polka = new HashMap<>();

    public Biblioteka() {
    }

    public Ksiazka wyszukajKsiazke(String isbn) throws NoEntryException {
        if (!polka.containsKey(isbn)){
            throw new NoEntryException("Nie ma takiej ksiazki w bibliotece.");
        }
        return polka.get(isbn);
    }

    public void dodajKsiazke(Ksiazka ksiazka) throws DuplicateEntryException {
        if (polka.containsKey(ksiazka.getISBN())){
            throw new DuplicateEntryException("Ksiazka juz jest w zestawie.");
        }
        polka.put(ksiazka.getISBN(), ksiazka);
    }

    public void usunKsiazke(Ksiazka ksiazka) throws NoEntryException {
        if (!polka.containsValue(ksiazka)){
            throw new NoEntryException("Nie ma takiej ksiazki w bibliotece.");
        }
        polka.remove(ksiazka);
    }

    public void usunKsiazke(String isbn) throws NoEntryException {
        if (!polka.containsKey(isbn)){
            throw new NoEntryException("Nie ma takiej ksiazki w bibliotece.");
        }
        usunKsiazke(wyszukajKsiazke(isbn));
    }

//    public void removeByIsbn(String isbn) throws NoEntryException {
//        Ksiazka usun = polka.remove(isbn);
//        if (usun == null){
//            throw new NoEntryException("Nie ma takiej ksiazki w bibliotece.");
//        }
//    }

//    public void remove(Ksiazka ksiazka) throws NoEntryException {
//        usunKsiazke(ksiazka.getISBN());
//    }


    public void pokazWszystkieKsiazki(){
        polka.values().stream().forEach(ksiazka -> System.out.println(ksiazka));
    }

//then comparing
    public void znajdzKsiazkiRokAutorMalejaco(Integer rok){
        polka.values().stream().filter(ksiazka -> ksiazka.getRokPublikacji() == rok)
//        polka.values().stream().filter(ksiazka -> rok.equals(ksiazka.getRokPublikacji()))
                .sorted(Comparator.comparing(book -> book.getAutor().getNazwisko()))
                .collect(Collectors.toList());
    }

//przefiltrowac posortowac laczony komparator then comparing na komparatorze
    public List<Ksiazka> znajdz(int iloscStron){
        polka.values().stream()
                .filter(ksiazka -> ksiazka.getLiczbaStron() > iloscStron)
                .sorted(Comparator.comparing(Ksiazka::getRokPublikacji).thenComparing(Ksiazka::getTytul))
                .collect(Collectors.toList());
    }
//zamienic ksiazki na ilosc stron


}
