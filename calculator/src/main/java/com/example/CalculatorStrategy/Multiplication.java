package com.example.CalculatorStrategy;

public class Multiplication implements CalculatorStrategy {
    @Override
    public double apply(double value1, double value2) {
        return value1 * value2;
    }
}
