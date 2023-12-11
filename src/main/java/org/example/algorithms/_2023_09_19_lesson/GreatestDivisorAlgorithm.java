package com.karadyauran._2023_09_19_lesson;

public class GreatestDivisorAlgorithm {
  public static void main(String[] args) {
    long start;
    long end;
    int result;

    start = System.nanoTime();
    result = findGreatestDivisorEuclidean(1210000000, 33000000);
    end = System.nanoTime();

    System.out.println("Euclidean, ns: " + (end - start));

    start = System.nanoTime();
    result = findGreatestDivisorBruteForce(1210000000, 33000000);
    end = System.nanoTime();

    System.out.println("BruteForce, ns: " + (end - start));
  }

  public static int findGreatestDivisorBruteForce(int a, int b) {
    int x = Math.min(a, b);
    int y = Math.max(a, b);

    for (int i = x; i > 1; i--) {
      if (x % i == 0 && y % i == 0) return i;
    }

    return 0;
  }

  public static int findGreatestDivisorEuclidean(int a, int b) {
    int x = Math.min(a, b);
    int y = Math.max(a, b);
    int tmp = x;

    while (tmp != 0) {
      tmp = y % x;
      y = x;
      x = tmp;
    }

    return y;
  }
}
