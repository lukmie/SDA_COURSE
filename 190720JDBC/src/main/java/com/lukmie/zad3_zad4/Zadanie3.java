package com.lukmie.zad3_zad4;

public class Zadanie3 {
    public static void main(String[] args) {
        KsiazkaDAO ksiazkaDAO = new KsiazkaDAO();
        AutorDAO autorDAO = new AutorDAO();

//        ksiazkaDAO.newBook("Java dla zaawansowanych");
//        ksiazkaDAO.updateById(11, "Java dla srednio zaawansowanych");
//        System.out.println(ksiazkaDAO.deleteById(10));
//        ksiazkaDAO.showAllBooks();
//        ksiazkaDAO.newBook("Java. Czesc I");
//        ksiazkaDAO.newBook("Java. Czesc II");
//        ksiazkaDAO.newBook("Java. Czesc III");
//        ksiazkaDAO.newBook("Java. Czesc IV");
//        System.out.println(ksiazkaDAO.updateById(15,"Java. Czesc V"));
//        ksiazkaDAO.showAllBooks();

//        ksiazkaDAO.newBook("Java. Spring");
//        ksiazkaDAO.updateLastRow();

        Autor tempAutor = new Autor("Jan", "Kochanowski");
        Ksiazka tempKsiazka = new Ksiazka("Wiersze");

//        ksiazkaDAO.newBook(tempKsiazka);
//        autorDAO.newAutor(tempAutor);

//        autorDAO.asignAutorToBook(tempAutor, tempKsiazka);

//        autorDAO.showBooksByAutor(1);
        System.out.println("Match result: " + autorDAO.checkMatch(1, 4));


    }
}
