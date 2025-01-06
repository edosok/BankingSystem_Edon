package org.example;

public class Account {
    private int balance;

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public int getBalance() {
        return balance;
    }

    public void displayBalance() {
        System.out.println("Balance: " + balance);
    }

    public void transfer(Account recipient, int amount) {
        if (amount > 0 && amount <= balance) {
            withdraw(amount);
            recipient.deposit(amount);
        }
    }
}
