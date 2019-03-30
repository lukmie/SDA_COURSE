package com.javagda23.zad2;

public class PilkaTenisowa {
    private String kolor;

    public PilkaTenisowa(String kolor) {
        this.kolor = kolor;
    }

    public String getKolor() {
        return kolor;
    }

    @Override
    public String toString() {
        return "PilkaTenisowa{" +
                "kolor='" + kolor + '\'' +
                '}';
    }
}
