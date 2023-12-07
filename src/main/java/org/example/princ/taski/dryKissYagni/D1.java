package org.example.princ.taski.dryKissYagni;

import java.util.List;

public class D1 {

  public double calculateAverageValueForGivenList(List<Double> listOfNumbers) {
    return listOfNumbers.stream().mapToDouble(Double::doubleValue).average().orElse(0);
  }
}