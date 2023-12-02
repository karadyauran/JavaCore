package org.example.treat.bank_ex_err;

public class BankAccount {
  private int balance;

  public BankAccount(int balance) {
    this.balance = balance;
  }

  public int getBalance() {
    return balance;
  }

  public void withdrawMoney(int amount) {
    balance = balance - amount;
  }
}
