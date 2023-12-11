package com.karadyauran._2023_10_25;

import java.io.*;

public class FileInputStreamAndOutputStream {
  public static void main(String[] args) {
    // this method isn't works
    /*try (BufferedReader reader = new BufferedReader(new FileReader("img_1.jpg"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("img_1_B.jpg"))) {

      int i;
      while ((i = reader.read()) != -1) {
        writer.write(i);
      }
      System.out.println("Done");
    } catch (IOException e) {
      throw new RuntimeException(e);
    }*/

    // for binary files
    try (FileInputStream inputStream = new FileInputStream("img_1.jpg");
         FileOutputStream outputStream = new FileOutputStream("img_1_BB.png")) {

      int i;
      while ((i = inputStream.read()) != -1) {
        outputStream.write(i);
      }
      System.out.println("Done");
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
