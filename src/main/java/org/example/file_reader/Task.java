package com.karadyauran._2023_10_23;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Task {
  static List<String> returnNames(String fileName) {
    List<String> names = new ArrayList<>();
    try (BufferedReader reader = new BufferedReader(new FileReader(fileName))){

      String line;
      while ((line = reader.readLine()) != null) {
        names.add(line);
      }

    } catch (IOException e) {
      throw new RuntimeException(e);
    }

    return names;
  }

  // Подсчет общего числа имен в файле
  static long countTotalNames(List<String> names) {
    return names.size();
  }

  // Нахождение уникальных имен в файле
  public Set<String> uniqueNames(List<String> names) {
    return new HashSet<>(names);
  }

  // Подсчет числа имен, содержащих заданную подстроку
  public long countNamesContainingSubstring(List<String> names, String substring) {
    return names.stream().filter(s -> s.contains(substring)).count();
  }

  //Нахождение имен, длина которых находится в заданном диапазоне
  public List<String> namesWithLengthInRange(List<String> names, int minLength, int maxLength) {
    return names.stream().filter(s -> s.length() >= minLength && s.length() <= maxLength).toList();
  }

  // Вывод первых N имен в алфавитном порядке
  public List<String> firstNNamesAlphabetically(List<String> names, int n) {
    return names.stream().limit(n).sorted().toList();
  }

  // Нахождение пяти самых часто встречающихся имен в файле
  static List<String> topFiveCommonNames(List<String> names) {
    return names.stream()
            .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
            .entrySet().stream()
            .sorted((el1, el2) -> Math.toIntExact(el2.getValue() - el1.getValue()))
            .limit(5)
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());
  }

  // Нахождение имен, которые начинаются на заданную букву и встречаются больше двух раз
  public Set<String> namesStartingWithAndOccurMoreThanTwice(List<String> names, char c) {
    return names.stream()
            .filter(s -> s.startsWith(String.valueOf(c)))
            .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
            .entrySet().stream()
            .sorted((el1, el2) -> Math.toIntExact(el1.getValue() - el2.getValue()))
            .filter(s -> s.getValue() > 2)
            .map(Map.Entry::getKey)
            .collect(Collectors.toSet());
  }

  // Нахождение двух имен с самой длинной и самой короткой длиной
  static Pair<String, String> longestAndShortestNames(List<String> names) {
    String shortestName = names.stream()
            .min(Comparator.comparingInt(String::length))
            .toString();

    String longestName = names.stream()
            .max(Comparator.comparingInt(String::length))
            .toString();

    return new Pair<>(longestName, shortestName);
  }


  public static void main(String[] args) {
    List<String> names = returnNames("names.txt");
    System.out.println(longestAndShortestNames(names));
  }
}

record Pair<L, S>(L longest, S shortest) {
  @Override
  public String toString() {
    return "Pair{" +
            "longest=" + longest +
            ", shortest=" + shortest +
            '}';
  }
}