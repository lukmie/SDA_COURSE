package com.lukmie.car.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarDI {
//    @Autowired
//    private Wheels wheels;
//    @Autowired
//    private Engine engine;

    private final Wheels wheels;
    private final Engine engine;

    @Autowired
    public CarDI(Wheels wheels, Engine engine) {
        this.wheels = wheels;
        this.engine = engine;
    }

//    private Wheels wheels;
//    private Engine engine;

//    public void setWheels(Wheels wheels) {
//        this.wheels = wheels;
//    }
//
//    public void setEngine(Engine engine) {
//        this.engine = engine;
//    }

    public void drive() {
        wheels.printSize();
        engine.printPower();
        System.out.println("CarDI drives");
    }


}
