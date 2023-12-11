package com.karadyauran._2023_09_04.taski.taski1.abs;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Product {
  private String name;
  private double price;

  public Product(String name, double price) {
    this.name = name;
    this.price = price;
  }
}
