package org.example.treat.pract_thread_4.exchanger;

import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Exchanger;

public class Courier implements Runnable{
  private final String start;
  private final String destination;
  private final List<Package> packageList;
  private Courier anotherCourier;
  private Exchanger<Package> exchanger;

  public Courier(String start, String destination, List<Package> packageList, Exchanger<Package> exchanger) {
    this.start = start;
    this.destination = destination;
    this.packageList = packageList;
    this.exchanger = exchanger;
  }

  public void setAnotherCourier(Courier anotherCourier) {
    this.anotherCourier = anotherCourier;
  }

  private void unload() {
    Iterator<Package> iterator = packageList.iterator();
    while (iterator.hasNext()) {
      Package p = iterator.next();
      if (p.getAddressOfArrival().equals(destination)) {
        System.out.printf("%s успешно доставил %s\n", this, p);
        iterator.remove();
      }
    }

    if (!packageList.isEmpty()) {
      System.out.printf("%s доставил не все посылки\n", this);
    } else {
      System.out.printf("%s успешно доставил все посылки\n", this);
    }
  }

  private Package getUnconvinientPackage() {
    Iterator<Package> iterator = packageList.iterator();
    while (iterator.hasNext()) {
      Package p = iterator.next();
      if (!p.getAddressOfArrival().equals(destination)) {
        iterator.remove();
        System.out.printf("%s передал %s другому курьеру\n", this, p);
        return p;
      }
    }
    return null;
  }

  @Override
  public void run() {
    try {
      Random random = new Random();
      int delayTime = random.nextInt(1_000, 10_000);

      Thread.sleep(delayTime);
      System.out.printf("%s выехал из точки %s\n", this, start);

      Thread.sleep(delayTime);
      System.out.printf("%s доехал до пункта обмена\n", this);

      packageList.add(exchanger.exchange(getUnconvinientPackage()));

      Thread.sleep(delayTime);
      System.out.printf("%s уехал из пункта обмена\n", this);

      Thread.sleep(delayTime);
      System.out.printf("%s доехал до точки выгрузки %s\n", this, destination);

      Thread.sleep(delayTime);
      unload();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  @Override
  public String toString() {
    return "Курьер: " + start + " -> " + destination;
  }
}
