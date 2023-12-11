package com.karadyauran._2023_09_04.taski.taski1.modules;

import com.karadyauran._2023_09_04.taski.taski1.abs.Product;
import com.karadyauran._2023_09_04.taski.taski1.interf.Discountable;

public class DigitalProduct extends Product implements Discountable {

  public DigitalProduct(String name, double price) {
    super(name, price);
  }

  @Override
  public void applyDiscount(double percentage) {
    if (percentage < 0 || percentage > 100) {
      System.out.println("Discount can't be " + percentage);
    } else {
      double oldPrice = getPrice();
      setPrice(oldPrice * ((100 - percentage) / 100));
    }
  }
}
