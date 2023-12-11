package com.karadyauran._2023_08_30.enums;

import lombok.Getter;

@Getter
public enum Season {
  WINTER("december", "january", "february"),
  SPRING("march", "april", "may"),
  SUMMER("june", "july", "august"),
  FALL("september", "november", "october");

  private final String month01, month02, month03;

  Season(String month01, String month02, String month03) {
    this.month01 = month01;
    this.month02 = month02;
    this.month03 = month03;
  }
}
