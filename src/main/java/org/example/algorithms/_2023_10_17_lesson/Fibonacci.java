package com.karadyauran._2023_10_17_lesson;

public class Fibonacci {
  public static void main(String[] args) {
    System.out.println(fibonacciRecursion(6));
  }

  private static int fibonacciRecursion(int n){
    if (n == 0) return 0;
    if (n == 1) return 1;
    return fibonacciRecursion(n - 2) + fibonacciRecursion(n - 1);
  }

  private static int fibonacciRecursionMemo(int n, int[] arr) {
    if (n == 0) return 0;
    if (n == 1) return 1;

    int[] temp = new int[n + 1];
    temp[1] = 1;

    return fibonacciRecursionMemo(n - 2, temp) + fibonacciRecursion(n - 1);
  }
}
