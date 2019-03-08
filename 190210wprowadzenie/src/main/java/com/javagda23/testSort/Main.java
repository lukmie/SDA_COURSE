package com.javagda23.testSort;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Patient johny = new Patient("Anna", "Bravo", 23, false);
        Patient anna = new Patient("Anna", "Grazka", 21, false);
        Patient pablo = new Patient("Pablo", "Escabo", 32, true);
        Patient grazyna = new Patient("Anna", "Grazka", 38, false);
        List<Patient> patients = new LinkedList<>();
        patients.add(johny);
        patients.add(anna);
        patients.add(pablo);
        patients.add(grazyna);

        for (Patient patient : patients) {
            System.out.println(patient.toString());
        }
        Collections.sort(patients);

        System.out.println("Dane po przesortowaniu: ");

        for (Patient patient : patients) {
            System.out.println(patient.toString());
        }

    }

}
