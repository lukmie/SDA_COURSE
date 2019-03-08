package com.javagda23.zad5;

public class MainProdukt {
    public static void main(String[] args) {
        Produkt pr1 = new Produkt("pizza", 20.0, PodatekProduktu.NO_VAT);
        Produkt pr2 = new Produkt("pizza", 20.0, PodatekProduktu.VAT23);
        System.out.println(pr1.podajCeneBrutto());
        Produkt[] tab = {pr1, pr2};

        Rachunek r = new Rachunek(tab);
        r.wypiszRachunek();
        System.out.println(r.sumaNetto());
        System.out.println(r.sumaBrutto());
        System.out.println("rozn " + r.roznica());
    }
}
