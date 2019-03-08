package com.javagda23.zad2Superhero;
// fabryka abstrakcyjna
public abstract class HeroCreator {
    //metody stworzeniowe, metody factory
    public static AbstractHero createVilian(){
        return new Vilian("Mar", new HeroStatistics(50, 50 ,50), TeamType.RED);
    }

    public static AbstractHero createSzeregowyVillain(String name) {
        return new Vilian(name, new HeroStatistics(50, 50, 50), TeamType.RED);
    }

    public static AbstractHero createSuperHero(String name) {
        return new SuperHero(name, new HeroStatistics(150, 150, 25), TeamType.GREEN);
    }
}
