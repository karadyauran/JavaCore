package com.karadyauran._2023_10_16.generics;

import java.util.ArrayList;
import java.util.List;

public class GE1 {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    List list1 = new ArrayList();

    list1.add("Q");
    list1.add("QW");
    list1.add("QA");
    list1.add(new Car());


    for (Object o : list1) {
      System.out.println((String) o);
    }
  }
}

class Car {

}