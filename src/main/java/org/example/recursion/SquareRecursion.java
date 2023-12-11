package com.karadyauran._2023_10_04;

public class SquareRecursion {
  public static void main(String[] args) {
    System.out.println(square(10, 2));
  }

  private static double square(int digit, int power) {
    if (power == 1) return digit;
    if (power > 0) return digit * square(digit, power - 1);
    return 1 / (digit * square(digit, -power - 1));
  }
}
