package org.example.JUnit_Testing.lesson_2023_11_08;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilTest {
  private static final StringUtil STRING_UTIL = new StringUtil();

  @ParameterizedTest
  @CsvSource(value = {
          "aaa, a#a#aaa, true",
          "aa, aaaa##, true",
          "a, a##, false"
  })
  public void checkStringsTest(String a, String b, boolean expected) {
    boolean res = STRING_UTIL.checkStrings(a, b);
    assertEquals(expected, res);
  }

  @ParameterizedTest
  @CsvSource(value = {
          "LRLR, true",
          "LRRUL, false",
          "UULLDDRR, true"
  })
  public void getFirstPositionTest(String str, boolean expected) {
    boolean res = STRING_UTIL.getFirstPosition(str);
    assertEquals(expected, res);
  }

  @ParameterizedTest
  @CsvSource(value = {
          "abc, aathgbcckf, 5",
          "aaa, abc, 1",
          "bbcg, dfss, 0"
  })
  public void countCharsTest(String a, String b, int expected) {
    assertEquals(expected, STRING_UTIL.countChars(a, b));
  }
}