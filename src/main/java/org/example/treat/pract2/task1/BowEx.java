package org.example.treat.pract2.task1;

public class BowEx {
  public static void main(String[] args) {
    Bow bow = new Bow();
    new Thread(bow::shoot).start();
    new Thread(bow::addArrows).start();
  }
}
