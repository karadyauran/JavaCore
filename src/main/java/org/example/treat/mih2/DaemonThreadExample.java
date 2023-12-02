package org.example.treat.mih2;

public class DaemonThreadExample {
  public static void main(String[] args) {
    System.out.println("Main start");

    UserThread userThread = new UserThread();
    userThread.setName("[USER THREAD]");

    DaemonThread daemonThread = new DaemonThread();
    daemonThread.setName("[DAEMON THREAD]");

    // daemonThread.setDaemon(true);

    userThread.start();
    daemonThread.start();

    System.out.println("Main end");
  }
}

class UserThread extends Thread {
  @Override
  public void run() {
    System.out.println("NAME: " + getName());
    System.out.println("IS DAEMON? : -> " + isDaemon());
    for (char c = 'A'; c <= 'Z'; c++) {
      try {
        sleep(600);
        System.out.println("CHAR: " + c);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }
}

class DaemonThread extends Thread {
  @Override
  public void run() {
    System.out.println("NAME: " + getName());
    System.out.println("IS DAEMON? : -> " + isDaemon());
    for (int i = 0; i < 300; i++) {
      try {
        sleep(100);
        System.out.println("NUMBER: " + i);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }
}