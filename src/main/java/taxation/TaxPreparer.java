package taxation;

import java.util.ArrayList;
import java.util.List;

public class TaxPreparer {
  public static void prepareTaxes(Taxable t) {}

  // Co-variance
  public static void prepareBulkTaxes(List<? extends Taxable> lt) {
//    lt.add(new Taxable());
    for (Taxable t : lt) {
      prepareTaxes(t);
    }
  }

  // didn't use this one :)
//  public static void getIndividualClients(List<Individual extends ?> li) {

  public static void getIndividualClients(List<? super Individual> li) {
    li.add(new Individual());
//    Individual i = li.get(0); // Fails if list<Taxable>
  }

  public static void main(String[] args) {
    List<Taxable> clients = new ArrayList<>();
    clients.add(new Corporation());
    clients.add(new Individual());

    getIndividualClients(clients);

    prepareBulkTaxes(clients);

    List<Individual> li = new ArrayList<>();
//    li.add(new Individual());
//    li.add(new Individual());
    getIndividualClients(li);
    prepareBulkTaxes(li);
  }
}
