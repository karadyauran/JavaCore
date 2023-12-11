package com.karadyauran._2023_10_25;

import com.github.javafaker.Faker;

import java.io.*;

public class Main {
  private static final Faker FAKER = new Faker();

  public static void main(String[] args) {
    Person777 person777 = new Person777(FAKER.name().name(), FAKER.number().numberBetween(18, 30));
    System.out.print("Before serial: ");
    System.out.println(person777);

    // Serialization
    try {
      FileOutputStream fileOut = new FileOutputStream("person.ser");
      ObjectOutputStream out = new ObjectOutputStream(fileOut);
      out.writeObject(person777);
      out.close();
      fileOut.close();
      System.out.println("Done");
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

    person777 = null;

    // Deserialization
    try {
      FileInputStream fileIn = new FileInputStream("person.ser");
      ObjectInputStream in = new ObjectInputStream(fileIn);
      person777 = (Person777) in.readObject();
      in.close();
      fileIn.close();
    } catch (IOException | ClassNotFoundException e) {
      throw new RuntimeException(e);
    }

    System.out.print("After serial: ");
    System.out.println(person777);
  }
}
