package com.javagda23.zad11;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Formularz {
    private int wiek;
    private int wzrost;
    private Plec plec;
    private int zarobki;
    private double waga;

    public String toString() {
        return  "wiek=" + wiek + "\n" +
                "wzrost=" + wzrost + "\n" +
                "plec=" + plec + "\n" +
                "zarobki=" + zarobki + "\n" +
                "waga=" + waga + "\n";
    }
}
