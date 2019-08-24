package com.lukmie.car;

import com.lukmie.car.model.CarDI;
import com.lukmie.car.model.CarNoDI;
import com.lukmie.car.model.Engine;
import com.lukmie.car.model.Wheels;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ComponentScan
public class Main {

    public static void main(String[] args) {
//        XML

//        CarNoDI tesla = new CarNoDI();
//        tesla.drive();

        //Car wymaga zależnosci a my je wstrzykujemy w konstruktor
//        Wheels wheels = new Wheels(28);
//        Engine engine = new Engine(550);
//        CarDI teslaDI = new CarDI(wheels, engine);
//        teslaDI.drive();

//        CarDI teslaDISeter = new CarDI();
//        teslaDISeter.setEngine(engine);
//        teslaDISeter.setWheels(wheels);
//        teslaDISeter.drive();

//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
//
//        Engine engine1 = applicationContext.getBean(Engine.class);
//        Engine engine2 = applicationContext.getBean(Engine.class);
//        System.out.println("E1: ");
//        engine1.printPower();
//        System.out.println("E2: ");
//        engine2.printPower();
//

//        engine2.setPower(666);
//
//        System.out.println("E1: ");
//        engine1.printPower();
//        System.out.println("E2: ");
//        engine2.printPower();
//
//        Wheels wheels = applicationContext.getBean(Wheels.class);
//        wheels.printSize();

//        CarDI car = applicationContext.getBean(CarDI.class);
//        car.drive();

//        ANNOTATION
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Main.class);

//        Engine engine = applicationContext.getBean(Engine.class);
//        engine.printPower();

        CarDI car = applicationContext.getBean(CarDI.class);
        car.drive();

    }
}