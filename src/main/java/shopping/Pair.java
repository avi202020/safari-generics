package shopping;

import java.util.function.BiPredicate;

public class Pair<E> {
  E left;
  E right;

  public Pair(E left, E right) {
    this.left = left;
    this.right = right;
  }

  public E getLeft() {
    return left;
  }

  public void setLeft(E left) {
    this.left = left;
  }

  public E getRight() {
    return right;
  }

  public void setRight(E right) {
    this.right = right;
  }

  // Command pattern, MUCH better way to actually
  // determine Business logic based matching :)
  public boolean matched(BiPredicate<E, E> matcher) {
    return matcher.test(left, right);
  }

  @Override
  public String toString() {
    return "Pair{" +
        "left=" + left +
        ", right=" + right +
        '}';
  }
}
