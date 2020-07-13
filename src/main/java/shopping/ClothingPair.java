package shopping;

public class ClothingPair<E extends Sized & Colored> extends Pair<E> {
  java.lang.String s = "Hello";
  public ClothingPair(E left, E right) {
    super(left, right);
  }

  public boolean match() {
    return left.getSize() == right.getSize()
        && left.getColor().equals(right.getColor());
  }
}
