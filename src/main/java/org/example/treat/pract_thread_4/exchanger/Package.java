package org.example.treat.pract_thread_4.exchanger;

public class Package {
  private final String addressOfDepartment;
  private final String addressOfArrival;

  public Package(String addressOfDepartment, String addressOfArrival) {
    this.addressOfDepartment = addressOfDepartment;
    this.addressOfArrival = addressOfArrival;
  }

  public String getAddressOfArrival() {
    return addressOfArrival;
  }

  @Override
  public String toString() {
    return "Посылка: " + addressOfDepartment + " -> " + addressOfArrival;
  }
}
