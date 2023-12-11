package com.karadyauran._2023_10_16.generics.taskEx1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class Team<T extends Participant> {
  private Optional<String> name;
  private final List<T> participants = new ArrayList<>();
  private static final Random RANDOM = new Random(); // (private static final) UPPERCASE

  public Team(Optional<String> name) {
    this.name = name;
  }

  public void addNewParticipant(T newParticipant) {
    participants.add(newParticipant);
    System.out.println("New participant was added to the team : " + name);
  }

  public void play(Team<T> team) {
    Optional<String> winner;
    Optional<Integer> r = Optional.of(RANDOM.nextInt(2));
    if (r.get() == 0) winner = this.name;
    else winner = team.name;
    System.out.println("Winner : " + winner.get());
  }
}
