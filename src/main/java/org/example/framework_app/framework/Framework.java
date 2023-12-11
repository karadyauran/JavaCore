package org.example.framework;

import org.example.framework.annotations.AutoSet;
import org.example.framework.annotations.DataBase;
import org.example.framework.annotations.Service;
import org.example.framework.interfaces.AppService;
import org.reflections.Reflections;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Framework {
  private static Reflections reflections;
  private static Set<Object> databases;
  private static Set<Object> services;

  private static AppService getService(String type) {
    for (Object service : services) {
      if (service.getClass().getSimpleName().toLowerCase().startsWith(type)) {
        return (AppService) service;
      }
    }
    return null;
  }

  private static void work() {
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.println("Введите запрос или exit для выхода");
      String req = scanner.nextLine().toLowerCase();
      if (req.equals("exit")) break;
      // cat all
      // cat 3
      String[] reqArr = req.split(" ");
      if (reqArr.length != 2) continue;
      String type = reqArr[0];
      AppService service = getService(type);
      if (service != null) {
        if (reqArr[1].equals("all")) {
          service.printAll();
        } else {
          service.printOne(Integer.parseInt(reqArr[1]));
        }
      } else {
        System.out.println("Неверный запрос.");
      }
    }
    scanner.close();
  }

  private static void setDataBasesToServices(){
    for (Object service : services) {
      Field[] fields = service.getClass().getDeclaredFields();
      for (Field field : fields) {
        if (field.isAnnotationPresent(AutoSet.class)) {
          Class<?> classType = field.getType();
          for (Object database : databases) {
            if (database.getClass().equals(classType)) {
              field.setAccessible(true);
              try {
                field.set(service, database);
              } catch (Exception exception) {
                System.out.println("Не удалось засетить базу данных в сервис");
              }
            }
          }
        }
      }
    }
  }

  private static Set<Object> getAnnotatedInstances(Class<? extends Annotation> annotation) {
    Set<Class<?>> dbClasses = reflections.getTypesAnnotatedWith(annotation);
    Set<Object> result = new HashSet<>();
    try {
      for (Class<?> dbClass : dbClasses) {
        Object object = dbClass.getDeclaredConstructor().newInstance();
        result.add(object);
      }
    } catch (Exception exception) {
      System.out.println("Не удалось создать объект");
    }
    return result;
  }

  public static void run(Class<?> appClass) {
    Package parrentPackage = appClass.getPackage();
    reflections = new Reflections(parrentPackage.getName());
    databases = getAnnotatedInstances(DataBase.class);
    services = getAnnotatedInstances(Service.class);
    setDataBasesToServices();
    work();
  }
}
