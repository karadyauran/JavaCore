package com.karadyauran._2023_10_04;

public class Rec2 {
  public static void main(String[] args) {
   m1((el1, el2) -> {
     System.out.println(el1);
     System.out.println(el2);
   });
  }

  private static void m1(Inter inter) {
    System.out.println("****");
    inter.get("====", "++++");
  }
}

@FunctionalInterface
interface Inter {
  void get(String s1, String s2);
}