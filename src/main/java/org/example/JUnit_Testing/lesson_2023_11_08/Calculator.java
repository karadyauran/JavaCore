package org.example.JUnit_Testing.lesson_2023_11_08;

public class Calculator {
  public boolean calculate(int x, int y) {
    if (y == 0) throw new NullPointerException();
    if (x < y) throw new IllegalArgumentException();
    int z = x / y;
    return z < 5;
  }
}
