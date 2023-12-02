package org.example.treat.mih;

public class MT4 extends Thread {
  volatile boolean b = true;

  @Override
  public void run() {
    long count = 0;
    while (b) {
      count++;
    }
    System.out.println("COUNTER: " + count);
  }

  public static void main(String[] args) throws InterruptedException {
    MT4 mt4 = new MT4();
    mt4.start();

    Thread.sleep(600);
    System.out.println("Wake UP!");

    mt4.b = false;
    mt4.join();

    System.out.println("MAIN END");
  }
}