package org.example;

public class Cart {
    private double totalAmount;

    public double calculateTotalPrice(double price, double discount, double taxRate) {
        if (price < 0 || discount < 0 || taxRate < 0) {
            throw new IllegalArgumentException("Price, discount, and tax rate must be non-negative");
        }
        totalAmount = price * (1 - discount) + price * taxRate;
        totalAmount = discountedPrice * (1 + taxRate);
        return totalAmount;
    }

    public void displayTotalPrice() {
        System.out.println("Total Price: " + totalAmount);
    }
}
