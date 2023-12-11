package com.karadyauran._2023_10_17_lesson;

public class Ball {
  public static void main(String[] args) {
    System.out.println(nFunc(3));
  }

  public static int countRoutes(int step, int n) {
    if (step == n) return 1;
    if (step > n) return 0;
    return countRoutes(step + 1, n) + countRoutes(step + 2, n) + countRoutes(step + 3, n);
  }

  public static int nFunc(int m) {
    if (m == 0 || m == 1) return 1;
    if (m % 2 == 0) return nFunc(m / 2) +  nFunc(m / 2 - 1);
    return nFunc(m / 2) - nFunc(m / 2 - 1);
  }
}
