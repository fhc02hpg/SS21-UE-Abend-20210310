package ue.socialmedia;

import java.util.Comparator;

public class ShareLikeRatioDescComparator implements Comparator<Posting> {

  @Override
  public int compare(Posting o1, Posting o2) {
    double shareLikeRatioO1 = 1.0 * o1.getShares() / o1.getLikes();
    double shareLikeRatioO2 = 1.0 * o2.getShares() / o2.getLikes();
    return Double.compare(shareLikeRatioO2,shareLikeRatioO1);
  }
}
