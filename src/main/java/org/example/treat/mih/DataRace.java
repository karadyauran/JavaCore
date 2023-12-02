package org.example.treat.mih;

public class DataRace {
  public static void main(String[] args) {
    THDR thdr = new THDR();
    Thread t1 = new Thread(thdr);
    Thread t2 = new Thread(thdr);
    Thread t3 = new Thread(thdr);

    t1.start();
    t2.start();
    t3.start();
  }
}

class Counter {
  static int count = 0;
}

class THDR implements Runnable {
  public /*static*/ void increase() {
    synchronized (/*THDR.class*/ this) {
      Counter.count++;
    }
    System.out.println("Counter: " + Counter.count);
  }

  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      increase();
    }
  }
}
