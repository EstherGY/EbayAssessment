package com.example;

import com.example.CalculatorStrategy.CalculatorStrategy;
// import org.springframework.stereotype.Component;

// @Component
public class ChainingCalculator {
    private double currentValue;

    public ChainingCalculator(double initialValue) {
        this.currentValue = initialValue;
    }

    public ChainingCalculator perform(CalculatorStrategy strategy, double operand) {
        this.currentValue = strategy.apply(this.currentValue, operand);
        return this;
    }

    public double getResult() {
        return this.currentValue;
    }
}
