package com.lukmie.car;

import com.lukmie.car.model.CarDI;
import com.lukmie.car.model.CarNoDI;
import com.lukmie.car.model.Engine;
import com.lukmie.car.model.Wheels;

public class Main {

    public static void main(String[] args) {

        CarNoDI tesla = new CarNoDI();
        tesla.drive();

        //Car wymaga zależnosci a my je wstrzykujemy w konstruktor
        Wheels wheels = new Wheels(28);
        Engine engine = new Engine(550);
        CarDI teslaDI = new CarDI(wheels, engine);
        teslaDI.drive();
    }
}
