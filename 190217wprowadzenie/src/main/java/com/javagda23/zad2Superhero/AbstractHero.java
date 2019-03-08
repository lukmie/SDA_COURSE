package com.javagda23.zad2Superhero;

import lombok.Data;

@Data
public abstract class AbstractHero {
    private String name;
    private HeroStatistics stats;
    private TeamType type;

    public AbstractHero(String name, HeroStatistics stats, TeamType type) {
        this.name = name;
        this.stats = stats;
        this.type = type;
        zwiekszStatystyki();
    }

    public void zwiekszStatystyki(){
        switch (type){
            case RED:
                stats.increaseHealth(50);
                break;
            case BLUE:
                stats.increaseAttack(50);
                break;
            case GREEN:
                stats.increaseDefence(50);
        }
    }

//    public HeroStatistics getStats() {
//        return stats;
//    }

    public abstract int getPower();
//    public HeroStatistics getHeroStatistic(){
//        return stats;
//    }

}
