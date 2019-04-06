package com.javagda23.creational.abstractFactory.zad1.car;

import com.javagda23.creational.abstractFactory.zad1.AbstractFactory;

public class CarFactory implements AbstractFactory<Car> {

    @Override
    public Car create(String type) {
        switch (type){
            case "CC":
                return createToyotaCorollaClassic();
            case "TA":
                return createToyotaAuris();
            case "SF":
                return createSkodaFabia();
        }
        throw new RuntimeException("Car type not found.");
    }

    private Car createToyotaCorollaClassic(){
        return new Toyota("Corolla", EngineType.GASOLINE_NATURALLY_ASPIRATED,1.6,4);
    }

    private Car createToyotaAuris(){
        return new Toyota("Auris", EngineType.GASOLINE_TURBO, 1.2, 4);
    }

    private Car createSkodaFabia(){
        return new Toyota("Fabia", EngineType.GASOLINE_TURBO, 1.0, 4);
    }
}
