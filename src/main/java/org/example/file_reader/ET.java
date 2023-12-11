package com.karadyauran._2023_10_23;

public class ET {
  static int dev(int a, int b) throws ZeroException {
    if (b == 0) throw new ZeroException("Zero");
    return a / b;
  }
  public static void main(String[] args) throws ZeroException {
    System.out.println(dev(4, 0));
  }
}
