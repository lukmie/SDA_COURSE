package com.lukmie.zad2;

import com.lukmie.entity.PacjentUpo;
import com.lukmie.entity.Upowazniony;

public class Main {
    public static void main(String[] args) {
        PacjentUpoDAO pacjentUpoDAO = new PacjentUpoDAO();

        PacjentUpo pacjentUpo1 = new PacjentUpo("Jan", "Kowalski", 123456);
        PacjentUpo pacjentUpo2 = new PacjentUpo("Michal", "Nowak", 111111);

        pacjentUpoDAO.add(pacjentUpo1);
        pacjentUpoDAO.add(pacjentUpo2);

        Upowazniony upowaznionyI = new Upowazniony("Adam", "Malysz", "123");
        Upowazniony upowaznionyIII = new Upowazniony("Krystyna", "Nowak", "321");
        pacjentUpoDAO.insertOrUpdatePersonI(upowaznionyI, 123456, 1);
        pacjentUpoDAO.insertOrUpdatePersonI(upowaznionyIII, 123456, 3);

        Upowazniony upowaznionyIa = new Upowazniony("Michal", "Aaaa", "333");
        pacjentUpoDAO.insertOrUpdatePersonI(upowaznionyIa, 111111, 1);

        System.out.println(pacjentUpoDAO.verifyUPO(upowaznionyIa, 123456));


    }
}
