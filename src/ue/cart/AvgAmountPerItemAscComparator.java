package ue.cart;

import java.util.Comparator;

public class AvgAmountPerItemAscComparator implements Comparator<Cart> {

  @Override
  public int compare(Cart o1, Cart o2) {
    double avgO1 = o1.getTotalAmount() / o1.getTotalItems();
    double avgO2 = o2.getTotalAmount() / o2.getTotalItems();
    return Double.compare(avgO1,avgO2);
  }


}
