package org.example.treat.synccolection;

import java.util.concurrent.atomic.AtomicInteger;

public class Atomic {
  static AtomicInteger counter = new AtomicInteger(0);

  public static void increase() {
    counter.incrementAndGet();
  }

  public static void main(String[] args) throws InterruptedException {
    Thread t1 = new Thread(new TaskRun());
    Thread t2 = new Thread(new TaskRun());

    t1.start();
    t2.start();

    t1.join();
    t2.join();

    System.out.println(counter);
  }
}

class TaskRun implements Runnable {
  @Override
  public void run() {
    for (int i = 0; i < 10000; i++) {
      Atomic.increase();
    }
  }
}