package com.sda.catmanager.house;

import org.springframework.stereotype.Component;

@Component
public class House {
    //1.
    //co mamy wstrzyknac
    //tworzymy pola
    private Water water;
    private Gas gas;
    private Electricity electricity;
    //2.
    //generujemy konstruktor

    public House(Water water, Gas gas, Electricity electricity) {
        this.water = water;
        this.gas = gas;
        this.electricity = electricity;
    }

    public void bringMedia() {
        water.runWater();
        gas.runGas();
        electricity.runEle();
    }
}
