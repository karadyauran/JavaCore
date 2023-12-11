package com.karadyauran._2023_10_16.generics.taskEx1;

import com.github.javafaker.Faker;

import java.util.Optional;

public class Main {
  private static final Faker FAKER = new Faker();

  public static void main(String[] args) {
    Pupil p1 = new Pupil(Optional.of(FAKER.name().name()), Optional.of(FAKER.number().numberBetween(5, 10)));
    Pupil p2 = new Pupil(Optional.of(FAKER.name().name()), Optional.of(FAKER.number().numberBetween(5, 10)));
    Pupil p3 = new Pupil(Optional.of(FAKER.name().name()), Optional.of(FAKER.number().numberBetween(5, 10)));
    Pupil p4 = new Pupil(Optional.of(FAKER.name().name()), Optional.of(FAKER.number().numberBetween(5, 10)));

    Teenager t1 = new Teenager(Optional.of(FAKER.name().name()), Optional.of(FAKER.number().numberBetween(10, 18)));
    Teenager t2 = new Teenager(Optional.of(FAKER.name().name()), Optional.of(FAKER.number().numberBetween(10, 18)));

    Adult a1 = new Adult(Optional.of(FAKER.name().name()), Optional.of(FAKER.number().numberBetween(25, 35)));
    Adult a2 = new Adult(Optional.of(FAKER.name().name()), Optional.of(FAKER.number().numberBetween(25, 35)));

    Team<Pupil> pupilTeam1 = new Team<>(Optional.of(FAKER.team().name()));
    Team<Pupil> pupilTeam2 = new Team<>(Optional.of(FAKER.team().name()));
    Team<Teenager> teensTeam1 = new Team<>(Optional.of(FAKER.team().name()));

    pupilTeam1.addNewParticipant(p1);
    pupilTeam1.addNewParticipant(p2);

    pupilTeam2.addNewParticipant(p3);
    pupilTeam2.addNewParticipant(p4);

    teensTeam1.addNewParticipant(t1);
    teensTeam1.addNewParticipant(t2);

    // pupilTeam1.play(teensTeam1); not correct <-> pupil can't play with teens
    pupilTeam1.play(pupilTeam2);
  }
}
