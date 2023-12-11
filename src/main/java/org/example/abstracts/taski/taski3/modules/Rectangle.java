package com.karadyauran._2023_09_04.taski.taski3.modules;

public class Rectangle extends Shape implements Resizable {

  double width;
  double height;

  public Rectangle(double width, double height) {
    super(width * height);
    this.width = width;
    this.height = height;
  }

  @Override
  public void resize(double value) {
    this.height = this.height + value;
    this.width = this.width + value;
    this.square = this.width * this.height;
  }

  @Override
  public double calculateArea() {
    return this.square;
  }
}
