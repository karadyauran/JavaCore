package com.karadyauran._2023_08_30.modules;

import lombok.Getter;

@Getter
public class Person {
  String name;
  int age;
  Dog dog;
  Cat cat;

  public Person(String name, int age, Dog dog) {
    this.name = name;
    this.age = age;
    this.dog = dog;
  }

  public Person(String name, int age, Cat cat) {
    this.name = name;
    this.age = age;
    this.cat = cat;
  }

  private boolean isDog() {
    return dog != null;
  }

  @Override
  public String toString() {

    String animal = isDog() ? ", dog=" + dog : ", cat=" + cat;

    return "Person: {" +
            "name='" + name + '\'' +
            ", age=" + age +
            animal +
            '}';
  }
}
