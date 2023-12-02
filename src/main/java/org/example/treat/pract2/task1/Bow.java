package org.example.treat.pract2.task1;

public class Bow {
  private int arrows = 10;

  public synchronized void shoot() {
    while (arrows > 0) {
      try {
        Thread.sleep(1000);
        arrows--;
        System.out.printf("Выстрел! Осталось %d стрел.\n", arrows);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
    System.out.println("Стрелы закончились.");
    try {
      wait();
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }

  public synchronized void addArrows() {
    arrows = arrows + 10;
    System.out.println("В колчан было добавлено 10 стрел.");
    notify();
  }
}
