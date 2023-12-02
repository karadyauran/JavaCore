package org.example.searche_tree;

public class Main {
  public static void main(String[] args) {
    SearchTree<String, Integer> tree1 = new SearchTree<>();
    tree1.add("C", 10);
    tree1.add("A", 15);
    tree1.add("B", 2);

    SearchTree<String, Integer> tree2 = new SearchTree<>();
    tree2.add("Z", 10);
    tree2.add("B", 5);
    tree2.add("A", 2);
    tree2.add("K", 12);
    tree2.add("F", 32);
    tree2.add("X", 22);

    System.out.println(tree1.getKeys());
    System.out.println(tree2.getKeys());
  }
}
