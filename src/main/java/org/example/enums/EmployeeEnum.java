package com.karadyauran._2023_08_30;

import com.karadyauran._2023_08_30.enums.Curency;
import com.karadyauran._2023_08_30.enums.Access;
import com.karadyauran._2023_08_30.enums.Department;
import com.karadyauran._2023_08_30.modules.Employee;

public class EmployeeEnum {
  public static void main(String[] args) {
    Employee e1 = new Employee("Mike", Department.SALES, Access.LOW, Curency.USD);
    Employee e2 = new Employee("Paol", Department.FINANCE, Access.MIDDLE, Curency.EUR);
    Employee e3 = new Employee("Elena", Department.HR, Access.MIDDLE, Curency.USD);
    Employee e4 = new Employee("Carl", Department.SECURITY, Access.HIGH, Curency.EUR);

    Employee[] employees = {e1, e2, e3, e4};

    for (int i = 0; i < employees.length; i++) {
      if(employees[i].getAccess() == Access.MIDDLE) {
        System.out.println(employees[i].toString());
      }
    }
  }
}
