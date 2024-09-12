package com.example;

public class Calculator {

    public double calculate(Operation op, double num1, double num2) {
        switch (op) {
            case ADD:
                return num1 + num2;
            case SUBTRACT:
                return num1 - num2;
            case MULTIPLY:
                return num1 * num2;
            case DIVIDE:
                if (num2 == 0) throw new IllegalArgumentException("Cannot divide by zero.");
                return num1 / num2;
            default:
            throw new NullPointerException("Operation not supported.");
        }
    }
}
