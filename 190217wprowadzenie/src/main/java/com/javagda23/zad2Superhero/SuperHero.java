package com.javagda23.zad2Superhero;

public class SuperHero extends AbstractHero {
    public SuperHero(String name, HeroStatistics stats, TeamType type) {
        super(name, stats, type);
    }

    public int getPower() {
        return (getStats().getDefence() + getStats().getAttack())*getStats().getHealth();
    }


}
