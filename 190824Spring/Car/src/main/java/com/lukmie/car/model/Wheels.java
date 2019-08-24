package com.lukmie.car.model;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

//@AllArgsConstructor

public class Wheels implements InitializingBean {

    private int size;

    public Wheels() {
    }

    //    public Wheels(int size) {
//        this.size = size;
//    }

    public void printSize() {
        System.out.println("Wheel size: " + this.size);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Creating wheels...");
        this.size = 26;
    }
}
