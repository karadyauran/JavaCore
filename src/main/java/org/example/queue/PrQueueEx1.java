package com.karadyauran._2023_10_02;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PrQueueEx1 {
  public static void main(String[] args) {
    PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1, o2) -> o2 - o1); // compare lambda

    priorityQueue.add(17);
    priorityQueue.add(20);
    priorityQueue.add(5);
    priorityQueue.add(22);
    priorityQueue.offer(11);
    priorityQueue.offer(21);

    System.out.println(priorityQueue);
  }
}
