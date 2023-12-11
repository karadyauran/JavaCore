package com.karadyauran._2023_10_04.streams;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

@Data
@ToString
@AllArgsConstructor
public class Person implements Comparable<Person1> {
  String name;
  int age;
  boolean hasLicence;
  char gender;

  @Override
  public int compareTo(@NotNull Person1 o) {
    return this.age - o.getAge();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Person1 person = (Person1) o;
    return Objects.equals(name, person.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }
}
