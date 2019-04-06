package com.javagda23.structural.decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        ICalculator calculator = new CalculatorDecorator(new Calculator());
        calculator.subtract(2.5, 3.8);
    }
}
