package com.lukmie.zad3_Biblioteka;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class KsiazkaTest {

    private List<String> autorzy;
    private Biblioteka biblioteka;
    private Ksiazka ksiazka, ksiazka1, ksiazka2, ksiazka3, ksiazka4, ksiazka5, ksiazka6;

    @Before
    public void setUp(){
        biblioteka = new Biblioteka();
        autorzy = new ArrayList<>();
        ksiazka = new Ksiazka("A", autorzy, 1990);
        ksiazka1 = new Ksiazka("B", autorzy, 1990);
        ksiazka2 = new Ksiazka("C", autorzy, 1991);
        ksiazka3 = new Ksiazka("D", autorzy, 1992);
        ksiazka4 = new Ksiazka("E", autorzy, 1993);
        ksiazka5 = new Ksiazka("F", autorzy, 1994);
        ksiazka6 = new Ksiazka("G", autorzy, 1995);

        biblioteka.dodajKsiazke(ksiazka1);
        biblioteka.dodajKsiazke(ksiazka2);
        biblioteka.dodajKsiazke(ksiazka3);
        biblioteka.dodajKsiazke(ksiazka4);
        biblioteka.dodajKsiazke(ksiazka5);
        biblioteka.dodajKsiazke(ksiazka6);
//        biblioteka.dodajKsiazke(ksiazka);
    }

    @Test
    public void twoBooksAreIdentical(){
        autorzy.add("Jan Nowak");
        Ksiazka ksiazka1 = new Ksiazka("Jas i Malgosia", autorzy, 1990);
        Ksiazka ksiazka2 = new Ksiazka("Jas i Malgosia", autorzy, 1990);
        Assert.assertTrue(ksiazka1.equals(ksiazka2));
    }

    @Test
    public void checkIfBookHasBeenAdded(){
        biblioteka.dodajKsiazke(ksiazka);
        Assert.assertEquals(ksiazka, biblioteka.wszystkieKsiazkiWZbiorze().get(0));
    }

    @Test
    public void borrowABookFromList(){
        biblioteka.dodajKsiazke(ksiazka);
        boolean isBorrowed = biblioteka.wypozyczKsiazke(ksiazka);
        Assert.assertTrue(isBorrowed);
    }

    @Test(expected = IllegalArgumentException.class)
    public void borrowABookWhichIsNotInTheList(){
        biblioteka.wypozyczKsiazke(ksiazka);
    }

    @Test
    public void checkIfBookHasBeenBorrowed(){
        biblioteka.wypozyczKsiazke(ksiazka);
        Assert.assertTrue(ksiazka.czyWypozyczona());
    }

    @Test
    public void checkIfBookNotBorrowedReturnFalse(){
        Ksiazka nowaKsiazka = new Ksiazka("W pustyni i w puszczy", autorzy, 1990);
        Assert.assertFalse(nowaKsiazka.czyWypozyczona());
    }

    @Test
    public void checkIfThereIs5BooksOnList(){
        biblioteka.wypozyczKsiazke(ksiazka4);
        Assert.assertEquals(biblioteka.wszystkieDostepneKsiazki().size(), 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkIfReturnBookNotInTheListReturnError(){
        Ksiazka ksiazka = new Ksiazka("Co ma wisiec nie utonie", autorzy, 1990);
        biblioteka.zwrocKsiazke(ksiazka);
    }

    @Test
    public void checkIfListOfBooksInLibraryUpdateWhenBookIsReturned(){
        biblioteka.wypozyczKsiazke(ksiazka4);
        biblioteka.zwrocKsiazke(ksiazka4);
        Assert.assertEquals(biblioteka.wszystkieDostepneKsiazki().size(), biblioteka.wszystkieKsiazkiWZbiorze().size());
    }

    @Test
    public void checkDeletingBookFromList(){
        biblioteka.usunKsiazke(ksiazka4);
        Assert.assertEquals(biblioteka.wszystkieKsiazkiWZbiorze().size(), 5);
    }


}
