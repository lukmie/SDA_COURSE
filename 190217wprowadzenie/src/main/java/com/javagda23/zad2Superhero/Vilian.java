package com.javagda23.zad2Superhero;

public class Vilian extends AbstractHero {

    public Vilian(String name, HeroStatistics stats, TeamType type) {
        super(name, stats, type);
    }

    public int getPower() {
        return (getStats().getHealth() + getStats().getAttack())*getStats().getDefence();
    }

}
