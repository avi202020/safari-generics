package nonreifiable;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class ArrayStuff {

  // Mixing variable length argument lists and generics..
  // "Heap pollution"
  // varargs are passed as arrays...
  // this one is array of OBJECT
  // if this leaks out to the caller, or into a data structure
  // Bad...
  // If you are SURE it cannot leak (totally local variable
  @SafeVarargs
  public static <E> void doStuff(E ... values) {

  }
//  public static <E> E[] getAsArray(List<E> l, Class<? super E> type) {
  public static <F, E extends F> F[] getAsArray(List<E> l, Class<F> type) {
    // E[] is non-reifiable type!!! E is "type-erased"
//    E[] result = new E[l.size()];
//    E[] result = (E[])new Object[l.size()];
    F[] result = (F[]) Array.newInstance(type, l.size());
    for (int i = 0; i < l.size(); i++) {
      result[i] = l.get(i);
    }
    return result;
  }

  public static void main(String[] args) {
    List<String> names = Arrays.asList("Fred", "Jim", "Sheila");

    // Type inference for method invocation
//    String[] nameArray = getAsArray(names);
    // Explicit assignment for method invocation
//    Object[] nameArray = ArrayStuff.<String>getAsArray(names, CharSequence.class);
    CharSequence[] nameArray = ArrayStuff.getAsArray(names, CharSequence.class);
    for (CharSequence o : nameArray) {
      System.out.println("> " + o);
    }
    System.out.println("Type of array is " + nameArray.getClass().getName());
  }
}
