package com.karadyauran._2023_10_04.streams;

import java.util.Arrays;
import java.util.List;

public class S1 {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(2, 4, 5, 3, 6, 3, 2, 1);
    int[] arr = {4, 45, 23, 12, 56, 3, 8};

    // list.stream(); making stream for Lists
    // Arrays.stream(arr); making stream for Arrays
    // Create Stream -> intermediate methods -> terminal methods
    List<Integer> streamedList = list.stream()
            .filter(digit -> digit % 2 == 0) // 2, 4, 6, 2
            .map(element -> element * 10) // 20, 40, 60, 20
            .toList();

    System.out.println("streamedList -> " + streamedList);

    // Stream working starts from terminal methods

    list = Arrays.asList(2, 4, 5, 9, 9, 9, 2, 1);
    List<Integer> distinctList = list.stream()
            .distinct()
            .toList();

    System.out.println("distinctList -> " + distinctList);

    List<Integer> sortedDistincedList = list.stream()
            .sorted()
            .distinct()
            .toList();

    System.out.println("sortedDistincedList -> " + sortedDistincedList);

    List<Integer> sortedFilteredDistincedList = list.stream()
            .filter(entry -> entry % 2 == 0)
            .sorted()
            .distinct()
            .toList();

    System.out.println("sortedFilteredDistincedList -> " + sortedFilteredDistincedList);
  }
}
