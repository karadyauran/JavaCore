package com.karadyauran._2023_10_23.io;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
  public static void main(String[] args) {
    try (FileReader reader = new FileReader("src/main/java/com/karadyauran/_2023_10_23_lesson/io/222.txt")){
      int c;
      while ((c = reader.read()) != -1) {
        System.out.print((char) c);
      }
      System.out.println("\n");
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
