package ue.cart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CartSortDemo {

  public static void main(String[] args) {

    Cart c1 = new Cart("john",4,10,125.90);
    Cart c2 = new Cart("jane",1,1,5.90);
    Cart c3 = new Cart("jennifer",10,10,1000.00);
    Cart c4 = new Cart("bob",3,9,472.50);
    Cart c5 = new Cart("peter",7,14,333.60);
    Cart c6 = new Cart("philip",7,7,333.60);
    Cart c7 = new Cart("jane",4,12,150.00);

    List<Cart> carts = new ArrayList<>();
    carts.add(c1);
    carts.add(c2);
    carts.add(c3);
    carts.add(c4);
    carts.add(c5);
    carts.add(c6);
    carts.add(c7);


    System.out.println("pre-sort: "+carts);

    Collections.sort(carts);

    System.out.println("post-sort: "+carts);

    Collections.sort(carts,new CartUsernameComparator());

    System.out.println("username comparator sort: "+carts);

    carts.sort(new CardTotalItemsComparator());

    System.out.println("total items comparator sort: "+carts);

    carts.sort(new ArticlesDescItemsAscComparator());

    System.out.println("articles desc items asc comparator sort: "+carts);

    carts.sort(new UsernameDescTotalAmountAscComparator());

    System.out.println("username desc amount asc comparator sort: "+carts);

    carts.sort(new AvgAmountPerItemAscComparator());

    System.out.println("avg amount/item asc comparator sort: "+carts);

    carts.sort(new AvgAmountPerArticleDescComparator());

    System.out.println("avg amount/article asc comparator sort: "+carts);

  }

}
