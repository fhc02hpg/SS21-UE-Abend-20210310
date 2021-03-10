package ue.socialmedia;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoSortPostings {

  public static void main(String[] args) {

    List<Posting> postings = new ArrayList<>();
    postings.add(new Posting(123,"john doe","j-d", LocalDateTime.of(2021,3,10,21,0,10),0,11,3489));
    postings.add(new Posting(834,"jane foe","jf$", LocalDateTime.of(2021,2,12,0,10,0),100,505,4583));
    postings.add(new Posting(73,"bruce wayne","BrWay", LocalDateTime.of(2021,1,1,21,0,27),50,234,743));
    postings.add(new Posting(348,"max muster","MM", LocalDateTime.of(2021,3,3,12,20,56),10500,837,9483));
    postings.add(new Posting(23,"susi sorglos","suso", LocalDateTime.of(2021,3,10,21,0,43),37,237,2573));
    postings.add(new Posting(57,"petra doe","doepet", LocalDateTime.of(2020,12,31,23,55,16),561,6983,182));
    postings.add(new Posting(83,"emma wayne","waynee", LocalDateTime.of(2020,12,24,9,11,33),0,583,265434));
    postings.add(new Posting(938,"tim tim","doubleT", LocalDateTime.of(2019,8,30,14,10,10),999,100,234));
    postings.add(new Posting(1,"gwen muster","g/m", LocalDateTime.of(2019,7,1,7,26,1),23,493,48583));

    Collections.sort(postings);

    System.out.println("default sort: "+postings);

    //Collections.sort(postings, new DateTimeDescComparator());
    postings.sort(new DateTimeDescComparator());

    System.out.println("datetime desc sort: "+postings);

    postings.sort(new ShareLikeRatioDescComparator());

    System.out.println("share/like desc sort: "+postings);


  }

}
