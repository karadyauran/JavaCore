package org.example.treat.dead_lock;

public class ClassB {
  private ClassA classA;

  public void setClassA(ClassA classA) {
    this.classA = classA;
  }

  public synchronized void methodC () {
    System.out.println("thread methodC starts -> " + Thread.currentThread().getName());
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    classA.methodB();
    System.out.println("thread methodC ends -> " + Thread.currentThread().getName());
  }

  public synchronized void methodD () {
    System.out.println("thread methodD starts -> " + Thread.currentThread().getName());
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    System.out.println("thread methodD ends -> " + Thread.currentThread().getName());
  }
}
