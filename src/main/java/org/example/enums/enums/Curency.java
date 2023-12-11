package com.karadyauran._2023_08_30.enums;

import lombok.Getter;

@Getter
public enum Curency {
  USD("$"),
  EUR("€");

  private final String symbol;

  Curency(String symbol) {
    this.symbol = symbol;
  }
}
