package com.karadyauran._2023_08_30.modules;

import com.karadyauran._2023_08_30.enums.Curency;
import lombok.Getter;
import com.karadyauran._2023_08_30.enums.Access;
import com.karadyauran._2023_08_30.enums.Department;

@Getter
public class Employee {
  private String name;
  private Department department;
  private Access access;
  private Curency salaryCurency;

  public Employee(String name, Department department, Access access, Curency salaryCurency) {
    this.name = name;
    this.department = department;
    this.access = access;
    this.salaryCurency = salaryCurency;
  }

  @Override
  public String toString() {
    return "Employee{" +
            "name='" + name + '\'' +
            ", department=" + department +
            ", access=" + access +
            ", salaryCurency=" + salaryCurency +
            '}';
  }
}
