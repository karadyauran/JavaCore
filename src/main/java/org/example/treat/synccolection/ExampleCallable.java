package org.example.treat.synccolection;

import java.util.concurrent.*;

public class ExampleCallable {
  static int fResult;

  public static void main(String[] args) throws InterruptedException, ExecutionException {
    ExecutorService service = Executors.newSingleThreadExecutor();
    FactorialCallable factorial = new FactorialCallable(5);

    Future<Integer> future = service.submit(factorial);
    fResult = future.get();
    service.shutdown();

    System.out.println(fResult);
  }
}

class FactorialCallable implements Callable<Integer> {
  int f;

  public FactorialCallable(int f) {
    if (f < 1) throw new IllegalArgumentException();
    this.f = f;
  }

  @Override
  public Integer call() throws Exception {
    int result = 1;
    for (int i = 1; i <= f; i++) {
      result *= i;
    }
    return result;
  }
}
