package ue.cart;

import java.util.Comparator;

public class ArticlesDescItemsAscComparator implements Comparator<Cart> {

  @Override
  public int compare(Cart o1, Cart o2) {
    int articlesCmp = Integer.compare(o2.getNumArticles(),o1.getNumArticles());
    if(articlesCmp == 0) {
      return Integer.compare(o1.getTotalItems(),o2.getTotalItems());
    }
    return articlesCmp;
  }
}
