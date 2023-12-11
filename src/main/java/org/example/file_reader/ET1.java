package com.karadyauran._2023_10_23;

import java.util.InputMismatchException;
import java.util.Scanner;


/*
try { code with problems }
catch(exception) { do code... }
 */

public class ET1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("Please input a digit: ");

      try {
        int digit = scanner.nextInt();
        System.out.println("Digit: " + digit);
        break;
      } catch (InputMismatchException exception) {
        System.out.println("It is not a digit!!!!! Pishi normalno suka");
        scanner.nextLine();
      }
    }

    System.out.println("End");
    scanner.close();
  }
}
