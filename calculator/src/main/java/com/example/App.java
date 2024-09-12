package com.example;

import com.example.CalculatorStrategy.Addition;
import com.example.CalculatorStrategy.CalculatorStrategy;
import com.example.CalculatorStrategy.Division;
import com.example.CalculatorStrategy.Multiplication;
import com.example.CalculatorStrategy.Subtraction;

public class App 
{
    public static void main( String[] args )
    {
        //basic calculator
        Calculator calc = new Calculator();
        System.out.println(calc.calculate(Operation.ADD, 1, 2));

        //chaining operation
        CalculatorStrategy addition = new Addition();
        CalculatorStrategy subtraction = new Subtraction();
        CalculatorStrategy multiplication = new Multiplication();
        CalculatorStrategy division = new Division();
        
        ChainingCalculator chainingCal = new ChainingCalculator(0);
        
        double res = chainingCal
            .perform(addition, 5)
            .perform(multiplication, 2)
            .perform(subtraction, 3)
            .perform(division, 3)
            .getResult();
        System.out.println(res);
    }
}
