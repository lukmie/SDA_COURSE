package com.javagda23.structural.decorator;

public class Calculator implements  ICalculator{

    public int add(int a, int b){
        return a+b;
    }

    public  double subtract(double a, double b){
        return a - b;
    }

}
