package org.example.treat.synccolection;

import java.util.concurrent.locks.ReentrantLock;

public class COWAL {
  private double balance;
  private final ReentrantLock lock = new ReentrantLock();

  public COWAL(double balance) {
    this.balance = balance;
  }

  public void deposit(double amount) {
    balance = balance + amount;
  }

  public void withdraw(double amount) {
    lock.lock();
    try {
      balance = balance - amount;
    } finally {
      lock.unlock();
    }
  }
}
