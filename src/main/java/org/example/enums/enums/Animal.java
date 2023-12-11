package com.karadyauran._2023_08_30.enums;

public enum Animal {
  DOG {
    @Override
    public String makeSound() {
      return "Woof";
    }
  },
  CAT {
    @Override
    public String makeSound() {
      return "Meow";
    }
  };

  public abstract String makeSound();
}
