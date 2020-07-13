package lists;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UseAList {
  public static void breakList(List l) {
    l.add(0, LocalDate.now());
  }

  public static void main(String[] args) {
//    List<String> names = new ArrayList<String>(
    List<String> names = new ArrayList<>(
        Arrays.asList(/*LocalDate.now(), */"Alice", "Bob"));
//    names = Collections.checkedList(names, String.class);

    // Can't do this, because <String> is gone at runtime.
    // "Type Erasure" -- compiler knows about <String> and
    // Checks for consistent uses. Runtime, knows nothing.
//    if (names instanceof List<String>) {
//      System.out.println("it's a list...");
//    }
    names.add("Fred");
    names.add("Jim");
    names.add("Sheila");
//    names.add(LocalDate.now());

//    breakList(names);

//    String o = (String)names.get(3);
    String o = names.get(0); // "That Can't Happen!!"
    System.out.println("name is " + o);

    List<LocalDate> lld = new ArrayList();
//    lld.add("Fred");
    lld.add(LocalDate.now());
  }
}
