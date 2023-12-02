package org.example.treat.bank_ex_err;

public class Run {
  public static void main(String[] args) {
    BankAccount bankAccount = new BankAccount(1_500);
    Consumer consumer1 = new Consumer(bankAccount, "John");
    Consumer consumer2 = new Consumer(bankAccount, "Pit");

    consumer1.start();
    consumer2.start();

    try {
      consumer1.join();
      consumer2.join();
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }

    System.out.println("Остаток средств -> " + bankAccount.getBalance());
  }
}
