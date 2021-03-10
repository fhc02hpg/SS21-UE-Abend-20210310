package ue.cart;

import java.util.Comparator;

public class AvgAmountPerArticleDescComparator implements Comparator<Cart> {

  @Override
  public int compare(Cart o1, Cart o2) {
    double avgO1 = o1.getTotalAmount() / o1.getNumArticles();
    double avgO2 = o2.getTotalAmount() / o2.getNumArticles();
    return Double.compare(avgO2,avgO1);
  }

}
