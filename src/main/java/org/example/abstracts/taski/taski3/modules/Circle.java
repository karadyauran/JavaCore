package com.karadyauran._2023_09_04.taski.taski3.modules;

public class Circle extends Shape implements Resizable {

  double radius;

  public Circle(double radius) {
    super(3.14 * (radius * radius));
    this.radius = radius;
  }

  @Override
  public void resize(double value) {
    this.radius = this.radius + value;
    this.square = 3.14 * (this.radius * this.radius);
  }

  @Override
  public double calculateArea() {
    return this.square;
  }
}
