package org.example.treat.bank_ex_success;

public class BankAccount {
  private int balance;

  public BankAccount(int balance) {
    this.balance = balance;
  }

  public int getBalance() {
    return balance;
  }

  public synchronized boolean withdrawMoney(int amount) {
    if (amount >= balance) return false;
    balance = balance - amount;
    return true;
  }
}
