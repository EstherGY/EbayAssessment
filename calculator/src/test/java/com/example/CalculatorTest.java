package com.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testBasicCalculateAddition() {
        Calculator calc = new Calculator();
        assertEquals(3.0, calc.calculate(Operation.ADD, 1, 2), 0.01);
    }

    @Test
    public void testBasicCalculateSubtraction() {
        Calculator calc = new Calculator();
        assertEquals(-1.0, calc.calculate(Operation.SUBTRACT, 1, 2), 0.01);
    }

    @Test
    public void testBasicCalculateMultiplication() {
        Calculator calc = new Calculator();
        assertEquals(2.0, calc.calculate(Operation.MULTIPLY, 1, 2), 0.01);
    }

    @Test
    public void testBasicCalculateDivision() {
        Calculator calc = new Calculator();
        assertEquals(0.5, calc.calculate(Operation.DIVIDE, 1, 2), 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBasicCalculateDivisionByZero() {
        Calculator calc = new Calculator();
        calc.calculate(Operation.DIVIDE, 1, 0);
    }

    @Test(expected = NullPointerException.class)
    public void testBasicCalculateUnsupportedOperation() {
        Calculator calc = new Calculator();
        calc.calculate(null, 1, 2);
    }
    
}
