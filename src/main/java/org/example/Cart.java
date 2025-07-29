package org.example;

public class Cart {
    private double totalAmount;

    public double calculateTotalPrice(double price, double discount, double taxRate) {
        double discountedPrice = price * (1 - discount);
        totalAmount = discountedPrice * (1 + taxRate);
        return totalAmount;
    }

    public void displayTotalPrice() {
        System.out.println("Total Price: " + totalAmount);
    }
}
