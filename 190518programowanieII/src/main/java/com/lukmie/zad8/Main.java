package com.lukmie.zad8;

public class Main {
    public static void main(String[] args) {
        double szerokosc = 0.00001;
        double suma = 0.0;
        for (double i = 0; i < 15; i+=szerokosc) {
            suma += function(i + szerokosc/2)*szerokosc;
        }
        System.out.println(suma);

    }

    private static double function(double x) {
        return 3*Math.sin(x) - 0.2*Math.pow(x, 3) + 3*Math.pow(x, 2);
    }
}
