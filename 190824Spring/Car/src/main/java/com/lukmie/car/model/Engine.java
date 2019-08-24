package com.lukmie.car.model;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//@AllArgsConstructor
@Component
public class Engine implements InitializingBean, DisposableBean {
    private int power;

    public Engine() {
    }

    //    public Engine(int power) {
//        this.power = power;
//    }

    public void printPower() {
        System.out.println("Engine power: " + this.power);
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Creating engine...");
        this.power = 500;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroying engine...");
    }
}
