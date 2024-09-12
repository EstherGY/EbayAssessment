package com.example.CalculatorStrategy;

public class Division implements CalculatorStrategy {
    @Override
    public double apply(double value1, double value2) {
        if (value2 == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        return value1 / value2;
    }
}
