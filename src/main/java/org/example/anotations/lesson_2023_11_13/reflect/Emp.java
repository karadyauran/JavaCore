package org.example.anotations.lesson_2023_11_13.reflect;

public class Emp {
  public int id;
  public String department;
  private int val;

  public Emp() {}

  public Emp(int id, String department, int val) {
    this.id = id;
    this.department = department;
    this.val = val;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public int getVal() {
    return val;
  }

  public void setVal(int val) {
    this.val = val;
  }

  private void changeDep(String newDep) {
    department = newDep;
  }
}
