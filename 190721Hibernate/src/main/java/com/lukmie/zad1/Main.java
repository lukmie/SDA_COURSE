package com.lukmie.zad1;

import com.lukmie.entity.Uzytkownik;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UzytkownikDAO uzytkownikDAO = new UzytkownikDAO();
        Uzytkownik uzytkownik1 = new Uzytkownik("Lukasz", "Nowak");
        Uzytkownik uzytkownik2 = new Uzytkownik("Adam", "Abc");
        Uzytkownik uzytkownik3 = new Uzytkownik("Marek", "Bda");
        Uzytkownik uzytkownik4 = new Uzytkownik("Mateusz", "Foo");
        Uzytkownik uzytkownik5 = new Uzytkownik("Jakub", "Barr");

//        uzytkownikDAO.addUser(uzytkownik1);
//        System.out.println(uzytkownikDAO.findUser(2L).toString());
//        uzytkownikDAO.updateUserFirstName(42L, "Waldemar");
//        uzytkownikDAO.deleteUser(43L);

//        List<Uzytkownik> list = new ArrayList<>();
//        list.add(uzytkownik1);
//        list.add(uzytkownik2);
//        list.add(uzytkownik3);
//        list.add(uzytkownik4);
//        list.add(uzytkownik5);

//        for (Uzytkownik uzytkownik : list) {
//            uzytkownikDAO.addUser(uzytkownik);
//            System.out.println(uzytkownik.getId());
//        }


    }
}
