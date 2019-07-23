package com.lukmie.zad3;

import com.lukmie.entity.Adres;
import com.lukmie.zad3.dao.AdresDAO;

public class Main2 {
    public static void main(String[] args) {
        AdresDAO adresDAO = new AdresDAO();
        System.out.println(adresDAO.select(1));
    }
}
