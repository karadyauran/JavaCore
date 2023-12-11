package com.karadyauran._2023_09_04.taski.taski2.modules;

import com.karadyauran._2023_09_04.taski.taski2.abs.Account;
import com.karadyauran._2023_09_04.taski.taski2.interf.Transferable;

public class CreditAccount extends Account implements Transferable {
  int creditLimit;

  public CreditAccount(String accountOwner, int balance, int creditLimit) {
    super(accountOwner, balance);
    this.creditLimit = creditLimit;
  }

  @Override
  public void transfer(Account destination, double amount) {
    double oldBalance = getBalance();
    if (oldBalance < amount && oldBalance - amount < this.creditLimit * -1) {
      System.out.println("transfer not possible");
    } else {
      setBalance(oldBalance - amount);
      double oldBalanceDestination = destination.getBalance();
      destination.setBalance(oldBalanceDestination + amount);
    }
  }
}
