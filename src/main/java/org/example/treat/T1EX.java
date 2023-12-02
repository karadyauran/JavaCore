package org.example.treat;

public class T1EX {
  public static void main(String[] args) {
    for (int i = 0; i < 3; i++) {
      Utils utils = new Utils();
      utils.start();
    }
  }
}

class Utils extends Thread {
  @Override
  public void run () {
    for (int i = 0; i < 5; i++) {
      System.out.println(i + 1 + " = thread name - " + getName());
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }
}
