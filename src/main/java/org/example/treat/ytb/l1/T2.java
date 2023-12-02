package org.example.treat.ytb.l1;

public class T2 {
  public static void main(String[] args) {
    MyThread1 myThread1 = new MyThread1();
    // myThread1.start();
    // myThread1.start(); exception

    new MyThread1().start();
    new MyThread1().start();
    new MyThread1().start();
  }
}

class MyThread1 extends Thread {
  @Override
  public void run() {
    for (int i = 0; i < 20; i++) {
      System.out.println(getName() + " i = " + i);
    }
  }
}