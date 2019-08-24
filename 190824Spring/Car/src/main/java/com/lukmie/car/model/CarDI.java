package com.lukmie.car.model;

public class CarDI {
//    private final Wheels wheels;
//    private final Engine engine;

//    public CarDI(Wheels wheels, Engine engine) {
//        this.wheels = wheels;
//        this.engine = engine;
//    }

    private Wheels wheels;
    private Engine engine;

    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        wheels.printSize();
        engine.printPower();
        System.out.println("CarNoDI drives");
    }


}
