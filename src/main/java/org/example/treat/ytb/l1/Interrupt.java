package org.example.treat.ytb.l1;

public class Interrupt {
  public static void main(String[] args) {
    MyThread2 thread = new MyThread2();
    thread.start(); // Запускаем поток
    thread.interrupt(); // Прерываем поток

    try {
      Thread.sleep(1000); // Приостанавливаем главный поток на 1 секунду
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

  }
}

class MyThread2 extends Thread {
  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println("Поток 1: " + i);
      if (Thread.interrupted()) {
        System.out.println("Поток 1 был прерван");
        return;
      }
    }
  }
}