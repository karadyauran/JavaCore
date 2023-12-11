package org.example.aplication.databases;

import org.example.aplication.animals.Cat;
import org.example.framework.annotations.DataBase;
import org.example.framework.interfaces.AppDataBase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@DataBase
public class CatDataBase implements AppDataBase<Cat> {
  private final Map<Integer, Cat> cats = new HashMap<>();
  private int currentId;

  public CatDataBase() {
    add(10, "Barsik");
    add(2, "Tosha");
    add(4, "Boris");
  }

  @Override
  public List<Cat> getAll() {
    return new ArrayList<>(cats.values());
  }

  @Override
  public Cat getById(int id) {
    return cats.get(id);
  }

  @Override
  public Cat add(int age, String name) {
    Cat cat = new Cat(++currentId, name, age);
    cats.put(currentId, cat);
    return cat;
  }

  @Override
  public void delete(int id) {
    cats.remove(id);
  }
}
