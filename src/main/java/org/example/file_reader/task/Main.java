package com.karadyauran._2023_10_25.task;

import com.github.javafaker.Faker;

import java.util.Arrays;
import java.util.List;

public class Main {
  private static final Faker FAKER = new Faker();
  public static void main(String[] args) {
    Student s1 = new Student(1, FAKER.name().name(), FAKER.number().numberBetween(18, 25), FAKER.number().randomDouble(2, 10, 99));
    Student s2 = new Student(2, FAKER.name().name(), FAKER.number().numberBetween(18, 25), FAKER.number().randomDouble(2, 10, 99));
    Student s3 = new Student(3, FAKER.name().name(), FAKER.number().numberBetween(18, 25), FAKER.number().randomDouble(2, 10, 99));

    List<Student> students = Arrays.asList(s1, s2, s3);
    System.out.println(students);

    Utils.filterAndSaveStudentsByGrade(students, 30, "s");

    List<Student> serStudents = Utils.loadStudentsFromFile("s");

    double avg = Utils.calculateAverageGrade("s");
    System.out.println(serStudents);
    System.out.println(avg);
  }
}
