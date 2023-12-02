package org.example.treat.pract2;

public class Main {
  public static void main(String[] args) {
    MyThread1 t1 = new MyThread1("t1", 300);
    MyThread1 t2 = new MyThread1("t2", 500);

    t1.start();
    t2.start();

    DaemonThread daemonThread = new DaemonThread();
    daemonThread.start();

    Thread.currentThread().setName("main");

    for (int i = 0; i < 10; i++) {
      System.out.printf("Поток %s выполнился %d раз.\n", Thread.currentThread().getName(), i + 1);
      try {
        Thread.sleep(200);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }
}
