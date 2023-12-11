package com.karadyauran._2023_10_23;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ET2 {
  static void m1() throws FileNotFoundException {
    FileReader reader = new FileReader("2222.txt");
  }

  static void m2() throws FileNotFoundException {
    System.out.println("m2");
    m1();
  }

  public static void main(String[] args) {
    try {
      m2();
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
}
