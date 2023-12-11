package com.karadyauran._2023_09_04.taski.taski3;

import com.karadyauran._2023_09_04.taski.taski3.modules.Circle;
import com.karadyauran._2023_09_04.taski.taski3.modules.Rectangle;

public class Main {
  public static void main(String[] args) {
    Circle circle = new Circle(5);
    circle.resize(1.5);
    System.out.println("Circle area after resizing: " + circle.calculateArea());

    Rectangle rectangle = new Rectangle(4, 6);
    rectangle.resize(2);
    System.out.println("Rectangle area after resizing: " + rectangle.calculateArea());
  }
}
