package com.javagda23.zad0;

public class Calculator {

    double calculate(double x, double y, Operation operation){
        return operation.execute(x, y);
    }

}
