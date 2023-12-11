package com.karadyauran._2023_09_26_lesson;

import java.util.Objects;
import java.util.Scanner;

public class SumElements {
  public static void main(String[] args) {
    System.out.println(sumElements(5));

    Scanner scanner = new Scanner(System.in);
    String name = scanner.next();

    if (Objects.equals(name, "fdf")) {
      System.out.println(1);
    } else if (name.equals("Oleksandr")) {
      System.out.println(2);
    } else {
      System.out.println(4);
    }

  }

  private static int sumElements(int n) {
    if (n == 1) return 1; // base condition
    return n + sumElements(n - 1);
  }
}
