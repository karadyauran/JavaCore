package org.example.treat.mih;

public class MT2 {
  public static void main(String[] args) {
    Thread th1 = new Thread(new THR1());
    Thread th2 = new Thread(new THR2());

    th1.start();
    th2.start();

  }
}

class THR1 implements Runnable {

  @Override
  public void run() {
    for (int i = 0; i < 100; i++) {
      System.out.println("TH1: " + i + " ***");
    }
  }
}

class THR2 implements Runnable {

  @Override
  public void run() {
    for (int i = 100; i > 0; i--) {
      System.out.println("TH2: " + i + " %%%%%%%%%%");
    }
  }
}