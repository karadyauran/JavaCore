package org.example.treat.mih2;

public class WN {
  public static void main(String[] args) {
    Shop shop = new Shop();


    Producer producer = new Producer(shop);
    Consumer consumer = new Consumer(shop);

    Thread t1 = new Thread(producer);
    Thread t2 = new Thread(consumer);

    t1.start();
    t2.start();
  }
}

class Shop {
  private int itemsCount = 0;

  public synchronized void getItem() {
    while (itemsCount < 1) {
      try {
        wait();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

    try {
      Thread.sleep(500);
      itemsCount--;
      System.out.println("Item sold");
      System.out.println("ITEM COUNT: " + itemsCount);
      notify();
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }

  public synchronized void createItem() {
    while (itemsCount >= 5) {
      try {
        wait();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

    try {
      Thread.sleep(500);
      itemsCount++;
      System.out.println("Item added");
      System.out.println("ITEM COUNT: " + itemsCount);
      notify();
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }
}

class Producer implements Runnable {
  Shop shop;

  public Producer(Shop shop) {
    this.shop = shop;
  }

  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      shop.createItem();
    }
  }
}

class Consumer implements Runnable {
  Shop shop;

  public Consumer(Shop shop) {
    this.shop = shop;
  }

  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      shop.getItem();
    }
  }
}
