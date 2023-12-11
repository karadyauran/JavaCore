package com.karadyauran._2023_09_04.taski.taski1;

import com.karadyauran._2023_09_04.taski.taski1.modules.DigitalProduct;
import com.karadyauran._2023_09_04.taski.taski1.modules.PhysicalProduct;

public class Main {
  public static void main(String[] args) {
    PhysicalProduct physicalProduct = new PhysicalProduct("Phone", 500, 10);
    DigitalProduct digitalProduct = new DigitalProduct("Ebook", 20);

    physicalProduct.applyDiscount(10);
    digitalProduct.applyDiscount(50);

    System.out.println("Physical product price after discount: " + physicalProduct.getPrice());
    System.out.println("Digital product price after discount: " + digitalProduct.getPrice());
  }
}
