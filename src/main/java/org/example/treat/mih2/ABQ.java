package org.example.treat.mih2;

import java.util.concurrent.ArrayBlockingQueue;

public class ABQ {
  public static void main(String[] args) {
    ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(3);
    Thread producer = new Thread(() -> {
      String[] words = {"123", "Nik", "Tatiana", "Vladislav", "Aleksey", "Vasiliy", "Bogdan", "Mikhail", "Ruslan"};
      for (int i = 0; i < words.length && !Thread.interrupted(); i++) {
        try {
          Thread.sleep(1500);
          queue.put(words[i]);
          System.out.println("Producer added to the queue: " + words[i]);
          System.out.println("QUEUE SIZE: " + queue.size());
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    });

    Thread consumer = new Thread(() -> {
      StringBuilder stringBuilder = new StringBuilder();
      while (!Thread.interrupted()) {
        try {
          stringBuilder.setLength(0);
          Thread.sleep(6000);
          stringBuilder.append(queue.take());
          System.out.println("Consumer consume: " + stringBuilder.reverse());
          System.out.println("QUEUE SIZE: " + queue.size());
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    });

    producer.start();
    consumer.start();
  }
}
