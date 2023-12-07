package org.example.treat.pract_thread_4.barrier;

import java.util.concurrent.CyclicBarrier;

public class Main {
  public static void main(String[] args) {
    CyclicBarrier barrier = new CyclicBarrier(2, new FerryBoat());

    Thread t1 = new Thread(new Truck(barrier));
    Thread t2 = new Thread(new Truck(barrier));
    Thread t3 = new Thread(new Truck(barrier));
    Thread t4 = new Thread(new Truck(barrier));
    Thread t5 = new Thread(new Truck(barrier));
    Thread t6 = new Thread(new Truck(barrier));
    Thread t7 = new Thread(new Truck(barrier));
    Thread t8 = new Thread(new Truck(barrier));

    t1.setName("MAN-433");
    t2.setName("IVECO-8574");
    t3.setName("VOLVO-4563");
    t4.setName("RENAULT-859");
    t5.setName("SCANIA-543");
    t6.setName("IVECO-323");
    t7.setName("VOLVO-3211");
    t8.setName("RENAULT-4465");

    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();
    t6.start();
    t7.start();
    t8.start();
  }
}
