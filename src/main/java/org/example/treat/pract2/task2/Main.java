package org.example.treat.pract2.task2;

public class Main {
  public static void main(String[] args) throws InterruptedException {
    MyThread m1 = new MyThread();
    MyThread m2 = new MyThread();
    MyThread m3 = new MyThread();

    m1.setName("m1");
    m2.setName("m2");
    m3.setName("m3");

    m1.start();
    m1.join(2000);

    m2.start();
    m1.join();

    m3.start();
    m2.join();
    m3.join();

    System.out.println("Все потоки отработали.");
  }
}
