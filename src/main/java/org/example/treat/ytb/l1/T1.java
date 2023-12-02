package org.example.treat.ytb.l1;

public class T1 {
  public static void main(String[] args) {
    MyThread1 myThread = new MyThread1();
    myThread.start();
    System.out.println(Thread.currentThread().getName());

    MyRunnable myRunnable = new MyRunnable();
    Thread thread2 = new Thread(myRunnable);
    thread2.start();
  }
}

class MyThread extends Thread {
  @Override
  public void run() {
    System.out.println(getName());
  }
}

class MyRunnable implements Runnable {
  @Override
  public void run() {
    System.out.println(Thread.currentThread().getName());
  }
}
