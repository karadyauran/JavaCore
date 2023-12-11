package com.karadyauran._2023_10_02;

import com.karadyauran._2023_10_02.cat.Cat;

import java.util.ArrayDeque;

public class QueueEx1 {
  public static void main(String[] args) {
    ArrayDeque<Cat> deque = new ArrayDeque<>();

    Cat cat1 = new Cat("Cat One", 1);
    Cat cat2 = new Cat("Cat Two", 2);

    deque.addFirst(cat1);
    deque.add(cat2);

    System.out.println(deque.getLast());
    System.out.println(deque.size());

    Cat cat3 = new Cat("Cat Three", 3);
    deque.addFirst(cat3);

    System.out.println(deque);
    System.out.println(deque.getLast());
  }
}
