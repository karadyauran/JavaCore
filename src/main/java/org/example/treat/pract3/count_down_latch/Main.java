package org.example.treat.pract3.count_down_latch;

import com.github.javafaker.Faker;

import java.util.concurrent.CountDownLatch;

public class Main {
  private static final Faker FAKER = new Faker();
  private static final CountDownLatch COUNT_DOWN_LATCH = new CountDownLatch(5);

  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      new Thread (new Passenger(FAKER.name().name(), COUNT_DOWN_LATCH)).start();
    }
  }
}
