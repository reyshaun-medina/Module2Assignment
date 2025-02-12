// Reyshaun Medina
// CSCI 211(24138)
// Assignment 2
 
package Assignment2;

import java.util.ArrayList;

public class Bank {  
    private double amount;
    private ArrayList<Double> transactions = new ArrayList<Double>();

    public void deposit(double amount) {
        try {
            if (amount < 0.0) {
                throw new IllegalArgumentException("Deposits should be positive");
            } else {
                this.amount = amount;
                setTranscations();
            }
        } catch (IllegalArgumentException error) {
            System.out.printf("%s%n", error);
        }
    }

    public void withdrawal(double amount) {
        try {
            if (amount >= 0.0) {
                throw new IllegalArgumentException("Withdrawals should be negative");
            } else {
                this.amount = amount;
                setTranscations();
            }
        } catch (IllegalArgumentException error) {
            System.out.printf("%s%n", error);
        }
    }

    public void setTranscations() {
        transactions.add(this.amount);
    }

    public void listInteractions() {
        for (Double t : transactions) {
            System.out.printf("%s: %s%,.2f%n", (t < 0.0 ? "Withdrawal" : "Deposit"),
                    (t < 0.0 ? "" : "+"), t);
        }
    }
}
