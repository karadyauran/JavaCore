package org.example.treat.mih2;

public class Restaurant {
  private boolean isReady = false;

  public synchronized void cookDish() {
    try {
      Thread.sleep(1500);
      System.out.println("Cooking ...");
      isReady = true;
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    notifyAll();
  }

  public synchronized void takeDish(String wName) {
    try {
      while (!isReady) {
        wait();
      }
      Thread.sleep(500);
      System.out.println("Waiter " + wName + " is serving");
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }

    isReady = false;
  }
}

class Cook extends Thread {
  private Restaurant restaurant;

  public Cook(Restaurant restaurant) {
    this.restaurant = restaurant;
  }

  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      restaurant.cookDish();
    }
  }
}

class Waiter extends Thread {
  private String wName;
  private Restaurant restaurant;

  public Waiter(String wName, Restaurant restaurant) {
    this.wName = wName;
    this.restaurant = restaurant;
  }

  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      restaurant.takeDish(wName);
    }
  }
}

class Main {
  public static void main(String[] args) {
    Restaurant restaurant = new Restaurant();
    Cook cook = new Cook(restaurant);

    Waiter w1 = new Waiter("w1", restaurant);
    Waiter w2 = new Waiter("w2", restaurant);

    cook.start();
    w1.start();
    w2.start();
  }
}