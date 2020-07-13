package bridgemethod;

public class Parent<E> {
  public void doStuff(E e) {}
}

class Child extends Parent<String> {
  @Override
  public void doStuff(String s) {

  }

  // still has doStuff(Object ...)
}