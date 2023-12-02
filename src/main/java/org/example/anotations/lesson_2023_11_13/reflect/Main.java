package org.example.anotations.lesson_2023_11_13.reflect;

import java.lang.reflect.Field;

public class Main {
  public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
    Class empClass = Class.forName("org.example.anotations.lesson_2023_11_13.reflect.Emp");
    Field field = empClass.getField("id");
    System.out.println("Field type: " + field.getType());

    Field[] fields = empClass.getFields();
    for (Field f : fields) {
      System.out.println("TYPE: " + f.getType() + ", NAME: " + field.getName());
    }
  }
}
