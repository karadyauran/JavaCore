package org.example.aplication.services;

import org.example.aplication.databases.CatDataBase;
import org.example.framework.annotations.AutoSet;
import org.example.framework.annotations.Service;
import org.example.framework.interfaces.AppService;

@Service
public class CatService implements AppService {
  @AutoSet private CatDataBase dataBase;

  @Override
  public void printAll() {
    dataBase.getAll().forEach(System.out::println);
  }

  @Override
  public void printOne(int id) {
    System.out.println(dataBase.getById(id));
  }
}
