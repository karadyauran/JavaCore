package com.karadyauran._2023_09_04.taski.taski2.modules;

import com.karadyauran._2023_09_04.taski.taski2.abs.Account;
import com.karadyauran._2023_09_04.taski.taski2.interf.Transferable;

public class FixedBalanceAccount extends Account implements Transferable {
  public FixedBalanceAccount(String accountOwner, int balance) {
    super(accountOwner, balance);
  }

  @Override
  public void transfer(Account destination, double amount) {
    double oldBalance = getBalance();
    if (oldBalance < amount) {
      System.out.println("transfer not possible");
    } else {
      setBalance(oldBalance - amount);
      double oldBalanceDestination = destination.getBalance();
      destination.setBalance(oldBalanceDestination + amount);
    }
  }
}
