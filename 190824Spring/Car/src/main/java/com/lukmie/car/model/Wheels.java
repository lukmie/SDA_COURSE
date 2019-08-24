package com.lukmie.car.model;

import lombok.AllArgsConstructor;

//@AllArgsConstructor
public class Wheels {

    private int size;

    public Wheels(int size) {
        this.size = size;
    }

    public void printSize() {
        System.out.println("Wheel size: " + this.size);
    }
}
