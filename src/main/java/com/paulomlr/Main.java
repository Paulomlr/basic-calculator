package com.paulomlr;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Sum: " + calculator.add(2, 3));
        System.out.println("Subtract: " + calculator.subtract(5, 2));
        System.out.println("Multiply: " + calculator.subtract(4, 3));
        System.out.println("Divide: " + calculator.divide(6, 2));
    }
}