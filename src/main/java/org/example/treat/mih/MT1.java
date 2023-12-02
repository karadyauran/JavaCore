package org.example.treat.mih;


/**
 * Thread
 * Runnable
 * Callable
 */
public class MT1 {
  public static void main(String[] args) throws InterruptedException {
    System.out.println("MAIN START");

    TH1 th1 = new TH1();
    System.out.println(th1.getState());
    TH2 th2 = new TH2();

    th1.setName("TH1");
    th2.setName("TH2");

    System.out.println("NAME 1: " + th1.getName() + " PRIORITY: " + th1.getPriority());
    System.out.println("NAME 2 " + th2.getName() + " PRIORITY: " + th2.getPriority());

    th1.start();
    System.out.println(th1.getState());
    th2.start();

    th1.join();
    System.out.println(th1.getState());
    th2.join();

    System.out.println("MAIN END");
  }
}

class TH1 extends Thread {
  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println("TH1: " + i + " ()()()");
    }
  }
}

class TH2 extends Thread {
  @Override
  public void run() {
    for (int i = 10; i > 0; i--) {
      System.out.println("TH2: " + i + " &&&");
    }
  }
}
