package org.example.treat.synccolection;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExampleRunnable {
  /**
   * Runnable
   * Thread
   * Callable
   */

  static int fResult;

  public static void main(String[] args) throws InterruptedException {
    ExecutorService service = Executors.newSingleThreadExecutor();
    FactorialRunnable factorial = new FactorialRunnable(5);

    service.execute(factorial);
    service.shutdown();
    service.awaitTermination(6, TimeUnit.SECONDS);

    System.out.println(fResult);
  }
}

class FactorialRunnable implements Runnable {
  int f;

  public FactorialRunnable(int f) {
    if (f < 1) throw new IllegalArgumentException();
    this.f = f;
  }

  @Override
  public void run() {
    int result = 1;
    for (int i = 1; i <= f; i++) {
      result *= i;
    }
    ExampleRunnable.fResult = result;
  }
}