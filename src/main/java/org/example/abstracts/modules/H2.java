package com.karadyauran._2023_09_04.modules;

import com.karadyauran._2023_09_04.abstract_classes.Hero;
import com.karadyauran._2023_09_04.interfaces.Flyable;

public class H2 extends Hero implements Flyable {
  public H2(String name) {
    super(name);
  }

  @Override
  protected void walk() {
    System.out.println("H2 walk");
  }

  @Override
  protected void attack() {
    System.out.println("H2 attack");
  }

  @Override
  public void fly() {
    System.out.println("H2 fly");
  }
}
