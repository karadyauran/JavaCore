package org.example.treat.pract2;

public class DaemonThread extends Thread {

  public DaemonThread() {
    setDaemon(true);
  }

  @Override
  public void run() {
    while (true) {
      try {
        System.out.println("Отработал демон поток.");
        sleep(200);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }
}
