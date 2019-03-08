package com.javagda23.zad1;

public class Student {
    private String index;
    private String imie;
    private String nazwisko;
    private boolean czyMezczyzna;
    private Double[] ocenyWIndeksie;

    public Student(String index, String imie, String nazwisko, boolean czyMezczyzna) {
        this.index = index;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.czyMezczyzna = czyMezczyzna;
    }

    public Student(String index, String imie, String nazwisko, boolean czyMezczyzna, Double[] ocenyWIndeksie) {
        this.index = index;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.czyMezczyzna = czyMezczyzna;
        this.ocenyWIndeksie = ocenyWIndeksie;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public boolean isCzyMezczyzna() {
        return czyMezczyzna;
    }

    public void setCzyMezczyzna(boolean czyMezczyzna) {
        this.czyMezczyzna = czyMezczyzna;
    }

    public double obliczSredniaStudenta(){
        double suma =0;
        int iterator =0;
        for (Double oceny : ocenyWIndeksie) {
            if(oceny != null){
                suma += oceny;
                iterator++;
            }
        }
        return suma/iterator;
    }

    public boolean czyZdal(){
        for (int i = 0; i < ocenyWIndeksie.length; i++) {
            if(ocenyWIndeksie[i] != null && ocenyWIndeksie[i]<=2){
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "Student{" +
                "index='" + index + '\'' +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", czyMezczyzna=" + czyMezczyzna +
                '}';
    }
}
