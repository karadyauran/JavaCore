package org.example.searche_tree;

import java.util.LinkedList;
import java.util.Queue;

public class SearchTree<K extends Comparable<K>, V> {
  private Node<K, V> root;

  private static class Node<K, V> {
    private final K key;
    private V value;

    private Node<K, V> left;
    private Node<K, V> right;

    public Node(K key, V value) {
      this.key = key;
      this.value = value;

      this.left = null;
      this.right = null;
    }
  }

  public SearchTree() {
    root = null;
  }

  public V find(K key) {
    Node<K, V> tmp = root;
    while (tmp != null) {
      if (key.compareTo(tmp.key) == 0) return tmp.value;
      else if (key.compareTo(tmp.key) < 0) tmp = tmp.left;
      else tmp = tmp.right;
    }
    return null;
  }

  public void add(K key, V value) {
    root = add(root, key, value);
  }

  private Node<K, V> add(Node<K, V> node, K key, V value) {
    if (node == null) return new Node<>(key, value);
    if (key.compareTo(node.key) == 0) {
      node.value = value;
      return node;
    }

    if (key.compareTo(node.key) < 0) node.left = add(node.left, key, value);
    if (key.compareTo(node.key) > 0) node.right = add(node.right, key, value);
    return node;
  }

  public Iterable<K> getKeys() {
    Queue<K> queue = new LinkedList<>();
    inorder(queue, root);
    return queue;
  }

  private void inorder(Queue<K> queue, Node<K,V> node) {
    if (node == null) return; // base condition
    inorder(queue, node.left);
    queue.add(node.key);
    inorder(queue, node.right);
  }
}
