package org.example.treat.ytb.l1;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Ta1 {
  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    int numThreads = 4; // Количество потоков для параллельных вычислений
    ExecutorService executorService = Executors.newFixedThreadPool(numThreads);

    int chunkSize = numbers.length / numThreads; // Размер каждого подмассива

    Future<Integer>[] results = new Future[numThreads];

    for (int i = 0; i < numThreads; i++) {
      final int startIndex = i * chunkSize;
      final int endIndex = (i == numThreads - 1) ? numbers.length : (i + 1) * chunkSize;

      // Создаем задачу для вычисления суммы подмассива
      results[i] = executorService.submit(() -> {
        int sum = 0;
        for (int j = startIndex; j < endIndex; j++) {
          sum += numbers[j];
        }
        return sum;
      });
    }

    // Ожидаем завершения всех потоков и суммируем результаты
    int totalSum = 0;
    for (int i = 0; i < numThreads; i++) {
      try {
        totalSum += results[i].get();
      } catch (InterruptedException | ExecutionException e) {
        throw new RuntimeException(e);
      }
    }

    executorService.shutdown();

    System.out.println("Общая сумма: " + totalSum);
  }
}
