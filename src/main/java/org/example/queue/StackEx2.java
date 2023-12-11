package com.karadyauran._2023_10_02;

import com.karadyauran._2023_10_02.cat.Cat;

import java.util.Stack;

public class StackEx2 {
  public static void main(String[] args) {
    Stack<Cat> cats = new Stack<>();

    Cat tosha = new Cat("Tosha", 6);
    Cat musha = new Cat("Musha", 2);

    cats.push(tosha);
    cats.push(musha);

    Cat catElement = cats.peek();
    System.out.println("Your cat is " + catElement);

    System.out.println(cats);
  }
}
