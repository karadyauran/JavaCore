package com.karadyauran._2023_09_19_lesson;

import java.util.Arrays;

public class SearchAlgorithms {

  public static void main(String[] args) {

    int[] data = {1, 3, 5, 7, 0, -10, 13};
    System.out.println(searchLinear(data, 5));
    Arrays.sort(data);
    System.out.println("Sorted array: " + Arrays.toString(data));
    System.out.println(searchBinary(data, 5));
  }

  public static int searchLinear(int[] data, int key) {
    for (int i = 0; i < data.length; i++) {
      if (data[i] == key) return i;
    }
    return -1;
  }

  public static int searchBinary(int[] data, int key){
    int start = 0;
    int end = data.length - 1;
    int middle = (end - start) / 2;

    while (start <= end){
      if (data[middle] == key) return middle;
      if (data[middle] < key) start = middle + 1;
      if (data[middle] > key) end = middle - 1;
      middle = start + (end - start) / 2;
    }
    return -1;
  }


}