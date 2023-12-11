package com.karadyauran._2023_09_04;

import com.karadyauran._2023_09_04.abstract_classes.Beverage;
import com.karadyauran._2023_09_04.modules.Coffee;
import com.karadyauran._2023_09_04.modules.Tea;

public class Main001 {
  public static void main(String[] args) {
    Beverage tea = new Tea();
    tea.consume();

    Beverage coffee = new Coffee();
    coffee.consume();
  }
}
