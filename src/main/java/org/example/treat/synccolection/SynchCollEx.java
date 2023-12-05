package org.example.treat.synccolection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchCollEx {
  public static void main(String[] args) throws InterruptedException {
    List<Integer> source = Collections.synchronizedList(new ArrayList<>());
    for (int i = 0; i < 6; i++) source.add(i);
    List<Integer> target = new ArrayList<>();

    Thread t1 = new Thread(() -> target.addAll(source));
    Thread t2 = new Thread(() -> target.addAll(source));

    t1.start();
    t2.start();

    t1.join();
    t2.join();

    System.out.println(target);
  }
}
