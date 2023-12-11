package com.karadyauran._2023_09_26_lesson;

public class CountSumOperation {
  public static void main(String[] args) {
    System.out.println(sum(3, 5));
  }

  public static int sum (int a, int b) { // 1 + 2 = 3 = O(3) = O(1); space = O(1)
    int result = a + b; // 2
    return result; // 1
  }

  public static int sum(int[] array) { // 3(n+1) + 2n + 2 = 5n + 5 = O(5n + 5) = O(n); space = O(2) = O(1) (переменные)
    int result = 0; // 1

    for (int i = 0; i < array.length; i++) { // 3 (n + 1)
      result += array[i]; // 2n
    }

    return result; // 1
  }

  public static void fork(int n) { // time = O(n); space = O(1)
    if(n < 5) {
      System.out.println("number < 5");
    } else {
      for(int i = 0; i < n; i++) { // n
        System.out.println(i + " ");
      }
    }
  }


  public static void bubbleFor(int n) { // time = O(n^2); space = O(2) = O(1)
    for (int i = 0; i <= n / 3; i++){ // n/3
      for (int j = 1; j <= n; j = j + 4){ // n/4
        System.out.println("I study Big O notation");
      }
    }
  }

  public static void test3(int n) { // O(nlogn)
    int a = 0;
    for (int i = n/2; i <= n; i++) {
      for (int j = 2; j <= n ; j= j * 2) { // потому что тут умножение
        a = a + n/2;
      }
    }
  }

  public static void test4(int n) { // O(logn)
    int a = 0;
    int i = n;

    while (i > 0) {
      a++;
      i /= 2; // потому что тут деление
    }
  }
}
