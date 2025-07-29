package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    /**
     * Calculates and returns the sum of two integers as an Integer object.
     *
     * @param a the first integer to add
     * @param b the second integer to add
     * @return the sum of a and b as an Integer
     */
    public Integer sum(int a, int b) {
        return a + b;
    }

    public Integer subtract(int a, int b) {
        return a - b;
    }

    public Integer multiply(int a, int b) {
        return a * b;
    }
}