package org.example.JUnit_Testing.lesson_2023_11_08;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
  private static final Calculator CALCULATOR = new Calculator();

  @ParameterizedTest
  @CsvSource(value = {
          "20, 12, true",
          "10, 5, true",
          "7, 5, true",
          "7, 1, false"
  })
  public void calculateTest(int x, int y, boolean expected) {
    boolean res = CALCULATOR.calculate(x, y);
    assertEquals(expected, res);
  }
}