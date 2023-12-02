package org.example.treat.pract2;

public class MyThread1 extends Thread {
  private int millis;

  public MyThread1(String name, int miles) {
    setName(name);
    this.millis = miles;
  }

  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.printf("Поток %s выполнился %d раз.\n", getName(), i + 1);
      try {
        sleep(millis);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }
}
