package com.karadyauran._2023_08_30;

import com.karadyauran._2023_08_30.enums.Season;

import java.util.Arrays;

public class EnumPractice {
  public static void main(String[] args) {
    Season[] seasons = Season.values();
    System.out.println(Arrays.toString(seasons));

    for (Season season : seasons) {
      System.out.print(season.getMonth01() + " ");
      System.out.print(season.getMonth02() + " ");
      System.out.println(season.getMonth03());
    }

    System.out.println(Season.SPRING.getMonth01());
    System.out.println(Season.valueOf("FALL").getMonth02());
    System.out.println(Season.valueOf("SUMMER").ordinal());
  }
}
