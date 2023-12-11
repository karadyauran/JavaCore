package com.karadyauran._2023_10_16.generics.taskEx1;

import java.util.Optional;

public class Adult extends Participant {
  public Adult(Optional<String> name, Optional<Integer> age) {
    super(name, age);
  }
}
