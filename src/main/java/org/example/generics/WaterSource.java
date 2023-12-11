package com.karadyauran._2023_10_16.generics;

import lombok.Data;
import lombok.Getter;

@Data
public class WaterSource {
  private double liters;
}

@Data
class ElectricSource {
  private float kilowatt;
}

@Data
class GasSource {
  private double cubicMeters;
}


/**
 *
 * @param <S> source type
 */
@Getter
class Source<S> {
  private S quantity;

  public Source(S quantity) {
    this.quantity = quantity;
  }

  public static void main(String[] args) {
    Source<Double> water = new Source<>(1000.5d);
    Source<Float> kilowatt = new Source<>(55f);
  }
}