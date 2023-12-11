package com.karadyauran._2023_10_23.io;

import java.io.*;

public class BufferedReaderExample {
  public static void main(String[] args) {
    try (BufferedReader reader = new BufferedReader(new FileReader("write.txt"));
         BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/java/com/karadyauran/_2023_10_23_lesson/io/222.txt"))){

      String line;
      while ((line = reader.readLine()) != null) {
        writer.write(line);
      }

    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
