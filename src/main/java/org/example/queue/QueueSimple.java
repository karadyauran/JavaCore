package com.karadyauran._2023_10_02;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueSimple {
  public static void main(String[] args) {
    //FIFO
    Deque<Integer> queue = new ArrayDeque<>();
    System.out.println(queue.add(20));
    queue.add(17);
    queue.add(20);
    queue.add(5);
    System.out.println(queue);


    System.out.println(queue.pop()); // лучше использовать в связке с addLast
    System.out.println(queue.poll()); // лучше использовать в связке с add
    System.out.println(queue.pop());

    System.out.println(queue);
    System.out.println(queue.poll());
  }
}
