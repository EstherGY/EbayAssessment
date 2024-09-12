package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.example.CalculatorStrategy.Addition;
import com.example.CalculatorStrategy.CalculatorStrategy;
import com.example.CalculatorStrategy.Division;
import com.example.CalculatorStrategy.Multiplication;
import com.example.CalculatorStrategy.Subtraction;

public class ChainingCalculatorTest {
    @Test
    public void testChainingOperations() {
        CalculatorStrategy addition = new Addition();
        CalculatorStrategy multiplication = new Multiplication();
        CalculatorStrategy subtraction = new Subtraction();
        CalculatorStrategy division = new Division();

        ChainingCalculator chainedCalculator = new ChainingCalculator(10);

        double result = chainedCalculator
            .perform(addition, 5)
            .perform(multiplication, 2)
            .perform(subtraction, 3)
            .perform(division, 3)
            .getResult(); 

        assertEquals(9.0, result, 0.00001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChainingOperationsDivisionByZero() {
        CalculatorStrategy division = new Division();

        ChainingCalculator chainedCalculator = new ChainingCalculator(10);
        chainedCalculator.perform(division, 0);
    }
    
}
