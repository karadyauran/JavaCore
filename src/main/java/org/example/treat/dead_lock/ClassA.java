package org.example.treat.dead_lock;

public class ClassA {
  private ClassB classB;

  public void setClassB(ClassB classB) {
    this.classB = classB;
  }

  public synchronized void methodA () {
    System.out.println("thread methodA starts -> " + Thread.currentThread().getName());
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    classB.methodD();
    System.out.println("thread methodA ends -> " + Thread.currentThread().getName());
  }

  public synchronized void methodB () {
    System.out.println("thread methodB starts -> " + Thread.currentThread().getName());
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    System.out.println("thread methodB ends -> " + Thread.currentThread().getName());
  }
}
