package org.example.treat.mih;

public class MTE {
  static int[] array;
  static int sum = 0;

  public static void main(String[] args) throws InterruptedException {
    final int ARR_SIZE = 50;
    array = new int[ARR_SIZE];

    for (int i = 0; i < ARR_SIZE; i++) {
      array[i] = i + 1;
    }

    Thread tr1 = new Thread(() -> {
      int start = 0;
      int end = ARR_SIZE / 2;

      for (int i = start; i < end; i++) {
        sum += array[i];
      }
    });

    Thread tr2 = new Thread(() -> {
      int start = ARR_SIZE / 2;

      for (int i = start; i < ARR_SIZE; i++) {
        sum += array[i];
      }
    });

    tr1.start();
    tr2.start();

    tr1.join();
    tr2.join();

    System.out.println("TOTAL SUM = " + sum);
  }
}
