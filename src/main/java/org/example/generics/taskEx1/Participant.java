package com.karadyauran._2023_10_16.generics.taskEx1;

import java.util.Optional;

public abstract class Participant {
  private Optional<String> name;
  private Optional<Integer> age;

  public Participant(Optional<String> name, Optional<Integer> age) {
    this.name = name;
    this.age = age;
  }

  public Optional<String> getName() {
    return name;
  }

  public void setName(Optional<String> name) {
    this.name = name;
  }

  public Optional<Integer> getAge() {
    return age;
  }

  public void setAge(Optional<Integer> age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Participant{" +
            "name=" + name.get() +
            ", age=" + age.get() +
            '}';
  }
}
