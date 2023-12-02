package org.example.treat.pract2.task2;

public class MyThread extends Thread {
  @Override
  public void run() {
    System.out.printf("Поток %s начал свою работу за 5$/час\n", getName());
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    System.out.printf("Поток %s закончил свою работу за 5$/час\n", getName());
  }
}
