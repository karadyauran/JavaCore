package org.example.treat.pract3.semaphore;

import java.util.concurrent.Semaphore;

public class Main {
  public static void main(String[] args) {
    Semaphore semaphore = new Semaphore(2);
    new Car("bmw", semaphore);
    new Car("porsche", semaphore);
    new Car("audi", semaphore);
    new Car("mercedes", semaphore);
  }
}
