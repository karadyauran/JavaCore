package com.karadyauran._2023_10_02;

import java.util.Stack;

public class StackEx1 {
  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();

    System.out.println(stack.empty());

    stack.push(10);

    System.out.println(stack.empty());

    int elementFromStack = stack.pop();
    System.out.println(elementFromStack);

    System.out.println(stack.empty());
  }
}
