package org.example.treat.ytb.l1;

public class T3 {
  public static void main(String[] args) {
    SharedResource sharedResource = new SharedResource();
    int numberOfThreads = 4;

    // Создаем и запускаем потоки, которые устанавливают флаг
    Thread[] setterThreads = new Thread[numberOfThreads];
    for (int i = 0; i < numberOfThreads; i++) {
      final int threadNumber = i + 1;
      setterThreads[i] = new Thread(() -> {
        System.out.println("Установка флага " + threadNumber + " ...");
        sharedResource.setFlag();
      });
    }

    // Создаем и запускаем поток, который ждет, пока все флаги будут установлены
    Thread waiterThread = new Thread(() -> {
      System.out.println("Ожидание всех флагов...");
      try {
        sharedResource.waitForAllFlags(numberOfThreads);
        System.out.println("Все флаги установлены, продолжение выполнения.");
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    });

    for (Thread setterThread : setterThreads) {
      setterThread.start();
    }

    waiterThread.start();
  }
}

class SharedResource {
  private int flagCount = 0;
  private int targetFlagCount = 0;

  public synchronized void waitForFlag() throws InterruptedException {
    while (flagCount < targetFlagCount) {
      wait();
    }
  }

  public synchronized void setFlag() {
    try {
      System.out.println("Процесс..");
      Thread.sleep(2000);
      flagCount++;
      notify();
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }

  public synchronized void waitForAllFlags(int count) throws InterruptedException {
    targetFlagCount = count;
    while (flagCount < targetFlagCount) {
      wait();
    }
  }
}
