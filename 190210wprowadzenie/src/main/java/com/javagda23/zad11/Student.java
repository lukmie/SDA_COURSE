package com.javagda23.zad11;

import java.util.List;

public class Student {
    private List<Double> listaOcen;
    private String numerIndeksu;
    private String imie;
    private String nazwisko;

    public Student(List<Double> listaOcen, String numerIndeksu, String imie, String nazwisko) {
        this.listaOcen = listaOcen;
        this.numerIndeksu = numerIndeksu;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public List<Double> getListaOcen() {
        return listaOcen;
    }

    public void setListaOcen(List<Double> listaOcen) {
        this.listaOcen = listaOcen;
    }

    public String getNumerIndeksu() {
        return numerIndeksu;
    }

    public void setNumerIndeksu(String numerIndeksu) {
        this.numerIndeksu = numerIndeksu;
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

    public Double srednia(String indeks){
        double srednia = 0.0;
            for (Double ocena : listaOcen) {
                srednia += ocena/listaOcen.size();
            }
            return srednia;
    }



    @Override
    public String toString() {
        return "Student{" +
                "listaOcen=" + listaOcen +
                ", numerIndeksu='" + numerIndeksu + '\'' +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }


}
