package org.example.treat.dead_lock;

public class MyThread1 extends Thread {
  private ClassA classA;

  public MyThread1(ClassA classA, String name) {
    this.classA = classA;
    setName(name);
    start();
  }

  @Override
  public void run() {
    classA.methodA();
  }
}
