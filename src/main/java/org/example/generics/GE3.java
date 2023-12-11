package com.karadyauran._2023_10_16.generics;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class GE3 {
  public static void main(String[] args) {
    Show<String, Integer> show = new Show<>("W", 88);
    System.out.println(show.getV1() + " : " + show.getV2());
  }
}

@Getter
@AllArgsConstructor
class Show<V1, V2>{
  private V1 v1;
  private V2 v2;

  @Override
  public String toString() {
    return "Show{" +
            "v1=" + v1 +
            ", v2=" + v2 +
            '}';
  }
}
