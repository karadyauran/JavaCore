package com.karadyauran._2023_10_02.cat;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
public class Cat implements Cloneable{
  private final String name;
  private int age;
}
