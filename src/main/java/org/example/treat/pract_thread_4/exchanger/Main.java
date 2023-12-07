package org.example.treat.pract_thread_4.exchanger;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class Main {
  public static void main(String[] args) {
    Exchanger<Package> exchanger = new Exchanger<Package>();

    List<Package> packageList1 = new ArrayList<>();
    List<Package> packageList2 = new ArrayList<>();

    packageList1.add(new Package("A", "C"));
    packageList1.add(new Package("A", "D"));

    packageList2.add(new Package("B", "C"));
    packageList2.add(new Package("B", "D"));

    Courier courier1 = new Courier("A", "C", packageList1, exchanger);
    Courier courier2 = new Courier("B", "D", packageList2, exchanger);

    courier1.setAnotherCourier(courier2);
    courier2.setAnotherCourier(courier1);

    new Thread(courier1).start();
    new Thread(courier2).start();
  }
}
