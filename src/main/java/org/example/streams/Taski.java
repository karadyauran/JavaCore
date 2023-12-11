package com.karadyauran._2023_10_04.streams;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Taski {
  public static void main(String[] args) {
    // Фильтрация списка целых чисел на нечетные числа
    List<Integer> integers = Arrays.asList(12, 3, 5, 2, 5, 7, 9, 6, 4, 2, 4);
    List<Integer> filteredList = integers.stream()
            .filter(entry -> entry % 2 == 1)
            .toList();

    System.out.println(filteredList);

    // Преобразование списка строк в список чисел
    List<String> strings = Arrays.asList("1", "2", "3", "5", "6", "12");
    List<Integer> toIntegerStream = strings.stream()
            .map(Integer::parseInt)
            .toList();

    System.out.println(toIntegerStream);

    //Суммирование списка чисел
    int sumListElements = integers.stream()
            .reduce(0, Integer::sum);

    System.out.println(sumListElements);

    // Определение максимального значения в списке
    int maxListElement = integers.stream()
            .max(((o1, o2) -> o1 - o2))
            .get();

    System.out.println(maxListElement);

    // Фильтрация списка строк на те, которые начинаются с определенной буквы и преобразование их в верхний регистр
    strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry", "argument", "bill", "coffee");
    List<String> upperCaseList = strings.stream()
            .filter(entry -> entry.charAt(0) == 'a')
            .map(String::toUpperCase)
            .toList();

    System.out.println(upperCaseList);

    // Получение списка уникальных слов из списка строк, длина которых больше 4 символов
    strings = Arrays.asList("apple", "apple", "cherry", "own", "elderberry", "elderberry", "bill", "bill", "home");
    List<String> distinctList = strings.stream()
            .distinct()
            .filter(entry -> entry.length() > 4)
            .toList();

    System.out.println(distinctList);

    // Получение списка слов, содержащих только уникальные символы, из списка строк
    List<String> distinctByCharsList = strings.stream()
            .filter(entry -> {
              String filtered = entry.chars()
                      .mapToObj(c -> (char) c)
                      .distinct()
                      .map(Objects::toString)
                      .collect(Collectors.joining());
              return filtered.length() == entry.length();
            })
            .toList();

    System.out.println(distinctByCharsList);

    // Нахождение суммы чисел, кратных 3 и 5, из списка чисел
    integers = Arrays.asList(12, 3, 5, 2, 5, 7, 9, 6, 4, 2, 4);
    int sumOfIntegers = integers.stream()
            .filter(integer -> integer % 3 == 0 || integer % 5 == 0)
            .reduce(0, Integer::sum);

    System.out.println(sumOfIntegers);

    // Преобразование списка объектов класса в список их имен, отсортированных по возрасту
    Person1 p1 = new Person1("Amend", 20, true, 'M');
    Person1 p2 = new Person1("Oleksandr", 23, false, 'F');
    Person1 p3 = new Person1("Clara", 19, true, 'F');
    Person1 p4 = new Person1("Amelia", 16, false, 'F');
    Person1 p5 = new Person1("Denis", 24, false, 'M');
    Person1 p6 = new Person1("Bogdan", 27, true, 'M');
    Person1 p7 = new Person1("Angelina", 19, false, 'F');
    Person1 p8 = new Person1("Kirill", 16, true, 'M');
    Person1 p9 = new Person1("Victoria", 31, false, 'F');
    Person1 p10 = new Person1("Gerbert", 29, true, 'M');

    List<Person1> persons = new ArrayList<>();
    persons.add(p1);
    persons.add(p2);
    persons.add(p3);
    persons.add(p4);
    persons.add(p5);
    persons.add(p6);
    persons.add(p7);
    persons.add(p8);
    persons.add(p9);
    persons.add(p10);

    List<String> sortedPersons = persons.stream()
            .sorted()
            .map(Person1::getName)
            .toList();

    System.out.println(sortedPersons);
  }
}

@Data
@ToString
@AllArgsConstructor
class Person1 implements Comparable<Person1> {
  String name;
  int age;
  boolean hasLicence;
  char gender;

  @Override
  public int compareTo(@NotNull Person1 o) {
    return this.age - o.getAge();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Person1 person = (Person1) o;
    return Objects.equals(name, person.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }
}
