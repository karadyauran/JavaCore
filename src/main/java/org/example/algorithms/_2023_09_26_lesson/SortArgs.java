package com.karadyauran._2023_09_26_lesson;

import java.util.Arrays;
import java.util.Random;

public class SortArgs {
  public static void main(String[] args) {
    int count = 50000;

    int[] data = generateData(count);
    long start = System.nanoTime();
    Arrays.sort(data);
    long end = System.nanoTime();

    System.out.println("Arrays.sort   : " + (end - start));

    data = generateData(count);
    start = System.nanoTime();
    selectionSort(data);
    end = System.nanoTime();

    System.out.println("selectionSort : " + (end - start));
  }

  private static int[] generateData(int n) {
    Random random = new Random();
    int[] data = new int[n];

    for (int i = 0; i < n; i++) {
      data[i]= random.nextInt();
    }

    return data;
  }

  public static void sortBruteForce(int[] numbers) { // O(n^2) slower than selectionSort
    for (int i = 0; i < numbers.length; i++) {
      int min = numbers[i];
      for (int j = i + 1; j < numbers.length; j++) {
        if (numbers[j] < min) {
          min = numbers[j];
          numbers[j] = numbers[i];
          numbers[i] = min;
        }
      }
    }
  }

  public static void selectionSort(int[] numbers) { // O(n^2) faster then sortBruteForce
    for (int i = 0; i < numbers.length; i++) {
      int min = numbers[i];
      int indMin = i;

      for (int j = i + 1; j < numbers.length; j++) {
        if (numbers[j] < min) {
          indMin = j;
          min = numbers[j];
        }
      }

      min = numbers[i];
      numbers[i] = numbers[indMin];
      numbers[indMin] = min;
    }
  }
}
