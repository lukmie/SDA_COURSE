package com.javagda23.zad1_dzienniczek;

public class BrakOcenyException extends Exception {

    private Przedmiot przedmiot;

    public BrakOcenyException(Przedmiot przedmiot){
        this.przedmiot = przedmiot;
    }

    @Override
    public String getMessage() {
        return "Brak oceny z przedmiotu: " + przedmiot.name();
    }

//    public BrakOcenyException(String nazwaPrzedmiotu) {
//        super("Brak oceny z przedmiotu: " + nazwaPrzedmiotu);
//    }
}
