package shopping;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class UseAPair {
  public static void main(String[] args) {
    Pair<String> p = new Pair<>("Fred", "Jones");

    Pair<Map<Integer, List<Map.Entry<String, Long>>>> pSilly =
        new Pair<>(null, null);

    ClothingPair<Shoe> ps =
        new ClothingPair<>(new Shoe(9, "Brown"), new Shoe(9, "Red"));

    System.out.println("shoes match? " + ps.match());
  }
}
