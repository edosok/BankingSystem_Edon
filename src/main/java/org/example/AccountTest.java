package org.example;

import org.junit.jupiter.api.Test;

class AccountTest {

    @Test
    void deposit() {
        Account account = new Account();
        account.deposit(100);
        account.displayBalance();
    }

    @Test
    void withdraw() {
        Account account = new Account();
        account.deposit(2044);
        account.withdraw(20);
        account.displayBalance();
    }

    @Test
    void displayBalance() {
        Account account = new Account();
        account.deposit(1044);
        account.displayBalance();
    }

    @Test
    void transfer() {
        Account account1 = new Account();
        Account account2 = new Account();
        account1.deposit(44);
        account1.transfer(account2, 82);
        account1.displayBalance();
        account2.displayBalance();
    }
}
