package com.javagda23.structural.decorator;

public class CalculatorDecorator implements ICalculator {

    private Calculator calculator;

    public CalculatorDecorator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public int add(int a, int b) {
        return calculator.add(a, b);
    }

    @Override
    public double subtract(double a, double b) {
        System.out.println("In subtract method.");
        final double result = subtract(a, b);
        System.out.println(a + " - " + b + " = " + result);
        return result;
    }
}
