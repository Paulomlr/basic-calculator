package com.paulomlr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void testSubtract() {
        assertEquals(3, calculator.subtract(5, 2));
    }

    @Test
    void testMultiply() {
        assertEquals(12, calculator.multiply(4, 3));
    }

    @Test
    void testDivide() {
        assertEquals(3.0, calculator.divide(6, 2));
    }

    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(5, 0));
    }

    @Test
    void testPower() {
        assertEquals(8, calculator.power(2, 3));
    }

    @Test
    void testSquareRoot() {
        assertEquals(3.0, calculator.squareRoot(9));
    }

    @Test
    void testSquareRootNegative() {
        assertThrows(IllegalArgumentException.class, () -> calculator.squareRoot(-1));
    }
}