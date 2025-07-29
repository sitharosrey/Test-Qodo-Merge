package org.example;

public class Cart {
    private double totalAmount;

    public double calculateTotalPrice(double price, double discount, double taxRate) {
        totalAmount = price * (1 - discount) + price * taxRate;
        return totalAmount;
    }

    public void displayTotalPrice() {
        System.out.println("Total Price: " + totalAmount);
    }
}
