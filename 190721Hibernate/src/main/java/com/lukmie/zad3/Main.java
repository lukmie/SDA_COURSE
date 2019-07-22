package com.lukmie.zad3;


import com.lukmie.entity.Producent;
import com.lukmie.zad1.UzytkownikDAO;
import com.lukmie.zad3.dao.ProducentDAO;

public class Main {
    public static void main(String[] args) {

        ProducentDAO producentDAO = new ProducentDAO();
        Producent producent = new Producent("ABC");
        producentDAO.addProducent(producent);
    }


}
