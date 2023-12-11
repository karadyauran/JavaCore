package com.karadyauran._2023_09_04.taski.taski3.modules;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Shape {
  double square;

  abstract double calculateArea();

  public Shape(double square) {
    this.square = square;
  }
}
