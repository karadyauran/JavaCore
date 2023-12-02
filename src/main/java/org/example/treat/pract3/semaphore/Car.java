package org.example.treat.pract3.semaphore;

import java.util.concurrent.Semaphore;

public class Car extends Thread {
  private Semaphore semaphore;

  public Car(String name, Semaphore semaphore) {
    setName(name);
    start();
    this.semaphore = semaphore;
  }

  @Override
  public void run() {
    try {
      System.out.printf("Авто %s на старте\n", getName());
      sleep(3000);
      long start = System.currentTimeMillis();
      System.out.printf("Авто %s начало движение\n", getName());
      sleep(3000);
      System.out.printf("Авто %s подъехало к тоннелю\n", getName());
      sleep(3000);
      semaphore.acquire();
      System.out.printf("Авто %s въехало в тоннель\n", getName());
      sleep(3000);
      System.out.printf("Авто %s выехало из тоннеля\n", getName());
      semaphore.release();
      long end = System.currentTimeMillis();
      sleep(3000);
      System.out.printf("Авто %s финишировал за %d секунд\n", getName(), (end - start)/1000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }
}
