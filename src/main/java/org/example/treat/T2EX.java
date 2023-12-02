package org.example.treat;

import java.util.ArrayList;
import java.util.List;

public class T2EX {
  public static void main(String[] args) {
    Thread thread = new Thread(() -> {
      System.out.println("hello");
    });

    thread.start();
  }
}