package com.karadyauran._2023_09_04.taski.taski2.abs;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Account {
  String accountOwner;
  double balance;

  public Account(String accountOwner, int balance) {
    this.accountOwner = accountOwner;
    this.balance = balance;
  }
}
