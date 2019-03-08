package com.javagda23.zad11;

import java.util.List;

public class Dziennik {
    private List<Student> listaStudentow;

    public Dziennik(List<Student> listaStudentow) {
        this.listaStudentow = listaStudentow;
    }

    public List<Student> getListaStudentow() {
        return listaStudentow;
    }

    public void setListaStudentow(List<Student> listaStudentow) {
        this.listaStudentow = listaStudentow;
    }

    public void dodajStudenta(Student student) {
        listaStudentow.add(student);
    }

    public void usunStrudenta(Student student) {
        listaStudentow.remove(student);
    }

    public void usunStrudenta(String indeks) {
        for (Student student : listaStudentow) {
            if (student.getNumerIndeksu().equals(indeks)) {
                listaStudentow.remove(student);
                //break;
            }
        }
    }

    public Student znajdzStudenta(String indeks) {
        for (Student student : listaStudentow) {
            if (student.getNumerIndeksu().equals(indeks)) {
                return student;
            }
        }
        return null; //z exception to metoda void i throw new NoStudentException?
    }

    public Double podajSredniaStudenta(String indeks) {
        double srednia = 0.0;
        Student student = znajdzStudenta(indeks);
        if (student != null) {
            srednia = student.srednia(indeks);
            return srednia;
        } else
            return null;
    }


}
