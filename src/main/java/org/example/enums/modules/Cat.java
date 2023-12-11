package com.karadyauran._2023_08_30.modules;

import com.karadyauran._2023_08_30.enums.Animal;

public class Cat {
  String name;
  Animal animal;

  public Cat(String name, Animal animal) {
    this.name = name;
    this.animal = animal;
  }

  @Override
  public String toString() {
    return "Cat{" +
            "name='" + name + '\'' +
            ", animal=" + animal +
            '}';
  }
}
