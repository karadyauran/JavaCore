package org.example.regular_expressions;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;

public class RegEx6 {
  private static final Faker FAKER = new Faker();
  private static void info(Student student) {
    System.out.printf("%03d\t %-10s\t %-15s\t %.1f\n",
            student.id, student.name, student.surname, student.salary * (1 + student.pct));
  }

  private static Student studentMaker() {
    return new Student(
            FAKER.name().firstName(),
            FAKER.name().lastName(),
            FAKER.number().numberBetween(1000, 4000),
            FAKER.number().randomDouble(2, 1, 2) - 1);
  }

  public static void main(String[] args) {
    List<Student> studentList = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      studentList.add(studentMaker());
    }

    for (Student s : studentList) {
      info(s);
    }
  }
}

class Student {
  static int globalID = 100;
  int id;
  String name;
  String surname;
  int salary;
  double pct;

  public Student(String name, String surname, int salary, double pct) {
    this.id = globalID;
    this.name = name;
    this.surname = surname;
    this.salary = salary;
    this.pct = pct;
    globalID++;
  }
}
