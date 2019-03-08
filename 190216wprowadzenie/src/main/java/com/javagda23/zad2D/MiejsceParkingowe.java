package com.javagda23.zad2D;

public class MiejsceParkingowe {
    private int numerMiejsca;
    private StanMiejsca stanMiejsca;

    public MiejsceParkingowe(int numerMiejsca, StanMiejsca stanMiejsca) {
        this.numerMiejsca = numerMiejsca;
        this.stanMiejsca = stanMiejsca;
    }

    public int getNumerMiejsca() {
        return numerMiejsca;
    }

    public StanMiejsca getStanMiejsca() {
        return stanMiejsca;
    }

    public void setStanMiejsca(StanMiejsca stanMiejsca) {
        this.stanMiejsca = stanMiejsca;
    }

    @Override
    public String toString() {
        return "MiejsceParkingowe{" +
                "numerMiejsca=" + numerMiejsca +
                ", stanMiejsca=" + stanMiejsca +
                '}';
    }
}
