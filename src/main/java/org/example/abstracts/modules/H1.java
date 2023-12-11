package com.karadyauran._2023_09_04.modules;

import com.karadyauran._2023_09_04.abstract_classes.Hero;

public class H1 extends Hero {

  public H1(String name) {
    super(name);
  }

  @Override
  public void walk() {
    System.out.println("H1 walk");
  }

  @Override
  public void attack() {
    System.out.println("H1 attack");
  }
}
