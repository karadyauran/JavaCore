package com.karadyauran._2023_10_25.task;

import java.io.*;
import java.util.List;

public class Utils {
  public static void saveStudentsToFile(List<Student> students, String filename) {
   try(
           FileOutputStream fileOut = new FileOutputStream(filename + ".ser");
           ObjectOutputStream out = new ObjectOutputStream(fileOut);
           ) {

     out.writeObject(students);
     System.out.println("Done");
   } catch (IOException e) {
     throw new RuntimeException(e);
   }
  }

  public static List<Student> loadStudentsFromFile(String filename) {
    List<Student> students;
    try(
            FileInputStream fileIn = new FileInputStream(filename + ".ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
    ) {

      students = (List<Student>) in.readObject();
    } catch (IOException | ClassNotFoundException e) {
      throw new RuntimeException(e);
    }

    return students;
  }

  public static void filterAndSaveStudentsByGrade(List<Student> students, double gradeThreshold, String filename) {
    try(
            FileOutputStream fileOut = new FileOutputStream(filename + ".ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
    ) {

      out.writeObject(students.stream().filter(student -> student.getGrade() > gradeThreshold).toList());
      System.out.println("Done");
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public static double calculateAverageGrade(String filename) {
    List<Student> students;
    try(
            FileInputStream fileIn = new FileInputStream(filename + ".ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
    ) {

      students = (List<Student>) in.readObject();
    } catch (IOException | ClassNotFoundException e) {
      throw new RuntimeException(e);
    }

    return students.stream()
            .mapToDouble(Student::getGrade)
            .average()
            .orElse(0);
  }
}
