package com.karadyauran._2023_10_10_lesson;

public class RecursionEx1 {
  public static void main(String[] args) {
    System.out.println(someRecursion(16));
  }

  private static int someRecursion(int n) {
    if (n == 2) return 2;
    return n + someRecursion(n - 1);
  }
}
