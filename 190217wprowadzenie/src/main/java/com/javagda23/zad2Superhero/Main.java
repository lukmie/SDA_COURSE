package com.javagda23.zad2Superhero;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        HeroStatistics heroStatistics = new HeroStatistics();
        AbstractHero vilian = HeroCreator.createVilian();

        AbstractHero villain = HeroCreator.createVilian();

        List<AbstractHero> heroes = new ArrayList<AbstractHero>();
        for (int i = 0; i < 100; i++) {
            heroes.add(HeroCreator.createSzeregowyVillain("janusz-" + i));
        }



        Vilian v = new Vilian("a", new HeroStatistics(1, 1, 1), null);
    }
}
