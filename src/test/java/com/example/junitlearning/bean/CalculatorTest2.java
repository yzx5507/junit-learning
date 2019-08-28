package com.example.junitlearning.bean;


import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculatorTest2 {


    @Test
    public void evaluateExpression() {
        Calculator calculator = new Calculator();
        int sum = calculator.evaluate("1+2+3+4");
        System.out.println(sum);
        assertEquals(10, sum);
    }

}