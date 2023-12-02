package org.example.treat;

import java.util.ArrayList;
import java.util.List;

public class T3EX {
  private final List<String> list = new ArrayList<>();

  synchronized void addEntry (String s) {
    list.add(s);
  }

  synchronized int size() {
    return list.size();
  }

  public static void main(String[] args) throws InterruptedException {
    T3EX container = new T3EX();
    Runnable foo = () -> {
      for (int i = 0; i < 100000; i++) {
        container.addEntry("foo");
      }
    };
    List<Thread> threads = new ArrayList<>();
    for (long count = 10; count > 0; count--) {
      Thread thread = new Thread(foo);
      thread.start();
      threads.add(thread);
    }
    System.out.println("Size is " + container.size());
    while (container.size() < 1000000) {}
    System.out.println("Finished");
  }
}
