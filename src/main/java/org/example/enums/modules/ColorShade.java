package com.karadyauran._2023_08_30.modules;

public enum ColorShade {
  BLUE {
    @Override
    public void getColorCode() {
      System.out.println("#3944BC");
    }
  },
  COBALT{
    @Override
    public void getColorCode() {
      System.out.println("#1336BE");
    }
  },
  AZURE {
    @Override
    public void getColorCode() {
      System.out.println("#1520A6");
    }
  };

  ColorShade () {
    System.out.println(name());
  }

  public abstract void getColorCode();
}
