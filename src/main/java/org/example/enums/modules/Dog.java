package com.karadyauran._2023_08_30.modules;

import lombok.Getter;
import com.karadyauran._2023_08_30.enums.Animal;

@Getter
public class Dog {
  String name;
  Animal animal;

  public Dog(String name, Animal animal) {
    this.name = name;
    this.animal = animal;
  }

  @Override
  public String toString() {
    return "Dog{" +
            "name='" + name + '\'' +
            ", animal=" + animal +
            '}';
  }
}
