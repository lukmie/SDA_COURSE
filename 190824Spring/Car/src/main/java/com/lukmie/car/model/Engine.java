package com.lukmie.car.model;

import lombok.AllArgsConstructor;

//@AllArgsConstructor
public class Engine {
    private int power;

    public Engine(int power) {
        this.power = power;
    }

    public void printPower() {
        System.out.println("Engine power: " + this.power);
    }

    public void setPower(int power) {
        this.power = power;
    }
}
