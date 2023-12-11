package com.karadyauran._2023_08_30;

import com.karadyauran._2023_08_30.enums.Animal;
import com.karadyauran._2023_08_30.modules.Cat;
import com.karadyauran._2023_08_30.modules.Dog;
import com.karadyauran._2023_08_30.modules.Person;

public class AnimalsClasses {
  public static void main(String[] args) {
    Person person001 = new Person("Person1", 19, new Dog("Dog1", Animal.DOG));
    Person person002 = new Person("Person2", 22, new Cat("Cat2", Animal.CAT));
    Person person003 = new Person("Person3", 12, new Dog("Dog3", Animal.DOG));
    Person person004 = new Person("Person4", 32, new Dog("Dog4", Animal.DOG));

    Person[] people = {person001, person002, person003, person004};
    for (Person person : people) {
      System.out.println(person.toString());
    }
  }
}

