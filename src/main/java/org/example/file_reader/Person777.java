package com.karadyauran._2023_10_25;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@Getter
@AllArgsConstructor
public class Person777 implements Serializable {
  private String name;
  private transient int age;

  @Override
  public String toString() {
    return name + " - " + age;
  }
}
