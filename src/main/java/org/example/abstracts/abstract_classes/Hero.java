package com.karadyauran._2023_09_04.abstract_classes;

public abstract class Hero {
  String name;

  public Hero(String name) {
    this.name = name;
  }

  protected abstract void walk(); // не имеет реализации, только сигнатура
  protected abstract void attack();

  void shot() {
    System.out.println("Shot!");
  }
}
