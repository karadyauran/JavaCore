package com.karadyauran._2023_10_23.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
  public static void main(String[] args) {
    String text = "If you want to live a happy life, tie it to a goal, not to people or things\n";
    try(FileWriter writer = new FileWriter("write.txt", true)) {
      for (int i = 0; i < text.length(); i++) {
        writer.write(text.charAt(i));
      }

      System.out.println("DONE");
    } catch (IOException exception) {
      throw new RuntimeException(exception);
    }
  }
}
