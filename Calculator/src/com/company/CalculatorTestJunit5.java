package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class CalculatorTestJunit5 {

    @Test
    void getSum() {
        Calculator test = new Calculator();
        double output = test.getSum(10.34,5);
        assertEquals(15.34, output,.001);
    }

    @Test
    void getMinus() {
        Calculator test = new Calculator();
        double output = test.getMinus(10.34,5.24);
        assertEquals(5.10, output,.001);
    }

    @Test
    void getMultiplication() {
        Calculator test = new Calculator();
        double output = test.getMultiplication(10.34,5);
        assertEquals(51.7, output,.001);
    }

    @Test
    void getDivision() {
        Calculator test = new Calculator();
        double output = test.getDivision(10.34,5);
        assertEquals(2.068, output,.0001);
    }
}