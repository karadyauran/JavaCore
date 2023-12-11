package com.karadyauran._2023_10_04;

public class Rec3 {
  public static void main(String[] args) {
    m1(Rec3::rr);
  }

  private static void m1(Inter1 inter) {
    System.out.println("****");
    inter.get();
  }

  private static void rr() { // Метод референс
    System.out.println(">>>>");
    System.out.println("<<<<");
    System.out.println("$$$$");
  }
}

@FunctionalInterface
interface Inter1 {
  void get();
}
