package com.lukmie.zad8;

public class App {
    public static void main(String[] args) {
        double startX = 0.0;
        double endX = 15.0;
        double szerokosc = 0.01;

        double suma = obliczCalke(startX, endX, szerokosc);

        System.out.println(suma);
    }

    private static double obliczCalke(double startX, double endX, double szerokosc) {
        double suma = 0.0;
        for (double i = startX; i < endX; i += szerokosc) {
            double wysokosc = function(i + szerokosc/2);
            double poleProstokata = szerokosc * wysokosc;
            suma += poleProstokata;
        }
        return suma;
    }

    private static double function(double x) {
        return 3*Math.sin(x) - 0.2*Math.pow(x, 3) + 3*Math.pow(x, 2);
    }
}
