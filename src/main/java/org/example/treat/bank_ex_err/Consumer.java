package org.example.treat.bank_ex_err;

public class Consumer extends Thread{
  private BankAccount bankAccount;

  public Consumer(BankAccount bankAccount, String name) {
    this.bankAccount = bankAccount;
    setName(name);
  }

  @Override
  public void run() {
    // 1 - Сколько денег хотим снимать?
    // 2 - Подойти к банкомату.
    // 3 - Проверить баланс.
    // 4 - Подумать, хватает ли денег?
    // 5 - Если денег хватает, снимаем
    try {
      int withdrawMoneyAmount = 1_000;
      Thread.sleep(3_000);
      System.out.println("Клиент " + getName() + " подошел к банкомату.");
      int currentBalance = bankAccount.getBalance();
      Thread.sleep(2_000);
      if (currentBalance >= withdrawMoneyAmount) {
        bankAccount.withdrawMoney(withdrawMoneyAmount);
        System.out.println("Клиент " + getName() + " успешно снял деньги!");
      } else {
        System.out.println("Клиент " + getName() + " не смог снять деньги!");
      }
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }


  }
}
