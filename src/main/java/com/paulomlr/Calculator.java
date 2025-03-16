package com.paulomlr;

public class Calculator {

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public double divide(int num1, int num2) {
        if(num2 == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed!");
        }
        return (double) num1 / num2;
    }

    public double power(int base, int exponent) {
        return Math.pow(base, exponent);
    }

    public double squareRoot(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Root of negative number is not allowed");
        }
        return Math.sqrt(number);
    }
}
