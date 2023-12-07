package org.example.treat.pract_thread_4.barrier;

public class FerryBoat implements Runnable{

  private long start = System.currentTimeMillis();

  @Override
  public void run() {
    for (int i = 0; i < 2; i++) {
      try {
        System.out.println("Паром отошел от берега");
        Thread.sleep(3000);
        System.out.printf("Паром выгрузил автомобили на противоположном берегу. Прошло %d секунд\n",
                (System.currentTimeMillis() - start) / 1000);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }
}
