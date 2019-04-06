package com.javagda23.creational.abstractFactory.zad1.car;

class Toyota implements Car { //wtedy jest package protected, moze byc uzywana tylko w paczce

    private String modelName;
    private EngineType engineType;
    private Double engineVolume;
    private int cylindersNum;

    public Toyota(String modelName, EngineType engineType, Double engineVolume, int cylindersNum) {
        this.modelName = modelName;
        this.engineType = engineType;
        this.engineVolume = engineVolume;
        this.cylindersNum = cylindersNum;
    }

    @Override
    public String getModelName() {
        return "Toyota " + modelName;
    }

    @Override
    public EngineType getType() {
        return engineType;
    }

    @Override
    public Double getEngineVolume() {
        return engineVolume;
    }

    @Override
    public int getCylindersNum() {
        return cylindersNum;
    }
}
