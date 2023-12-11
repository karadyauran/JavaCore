package com.karadyauran._2023_09_04.taski.taski2;

import com.karadyauran._2023_09_04.taski.taski2.modules.CreditAccount;
import com.karadyauran._2023_09_04.taski.taski2.modules.FixedBalanceAccount;

public class Main {
  public static void main(String[] args) {
    FixedBalanceAccount fixedAccount = new FixedBalanceAccount("123456", 1000);
    CreditAccount creditAccount = new CreditAccount("789012", -500, 1000);

    fixedAccount.transfer(creditAccount, 300);
    creditAccount.transfer(fixedAccount, 80);
    System.out.println("Fixed account balance: " + fixedAccount.getBalance());
    System.out.println("Credit account balance: " + creditAccount.getBalance());
  }
}
