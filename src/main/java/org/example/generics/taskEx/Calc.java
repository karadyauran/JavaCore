package com.karadyauran._2023_10_16.generics.taskEx;

import java.util.Optional;

public class Calc<V extends Number>{ // Number -> ... : if (super) -> ... <- Number
  private final V value;

  public Calc(V value) {
    this.value = value;
  }

  public double add(Calc<? extends Number> other) { // (?) -> Wild Card
    return this.value.doubleValue() + other.value.doubleValue();
  }

  public static void main(String[] args) {
    Calc<Integer> i = new Calc<>(10);
    Calc<Integer> j = new Calc<>(15);

    Optional<Double> addValue = Optional.of(i.add(j));
    System.out.println(addValue);
  }
}
