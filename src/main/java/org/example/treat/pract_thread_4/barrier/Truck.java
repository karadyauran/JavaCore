package org.example.treat.pract_thread_4.barrier;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;

public class Truck implements Runnable {
  CyclicBarrier barrier;
  public Truck(CyclicBarrier barrier) {
    this.barrier = barrier;
  }

  @Override
  public void run() {
    try {
      Random randomTime = new Random();

      int millis = randomTime.nextInt(1000, 10000);
      Thread.sleep(millis);
      System.out.printf("Грузовик %s заехал на паром\n", Thread.currentThread().getName());
      barrier.await();
      System.out.printf("Грузовик %s достиг другого берега\n", Thread.currentThread().getName());
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
