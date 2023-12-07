package org.example.princ.taski.dryKissYagni;

import java.util.ArrayList;
import java.util.List;

public class DAta {
  List<Double> numbers = new ArrayList<>();

  private double calculateAverage(List<Double> numbers) {
    return numbers.stream().mapToDouble(Double::intValue).average().orElse(0);
  }

  private double calculateVariance(List<Double> numbers, double average) {
    return numbers.stream().mapToDouble(v -> Math.pow(v - average, 2)).sum();
  }

  public double calculate() {
    double average = calculateAverage(numbers);
    double variance = calculateVariance(numbers, average);
    return Math.sqrt(variance / numbers.size());
  }
}