package ue.socialmedia;

import java.time.LocalDateTime;
import java.util.Objects;

public class Posting implements Comparable<Posting> {

  private int id;
  private String realname;
  private String screenname;
  private LocalDateTime datetime;
  private int likes;
  private int shares;
  private int views;

  public Posting(int id, String realname, String screenname, LocalDateTime datetime, int likes,
      int shares, int views) {
    this.id = id;
    this.realname = realname;
    this.screenname = screenname;
    this.datetime = datetime;
    this.likes = likes;
    this.shares = shares;
    this.views = views;
  }

  public int getId() {
    return id;
  }

  public String getRealname() {
    return realname;
  }

  public String getScreenname() {
    return screenname;
  }

  public LocalDateTime getDatetime() {
    return datetime;
  }

  public int getLikes() {
    return likes;
  }

  public int getShares() {
    return shares;
  }

  public int getViews() {
    return views;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Posting)) {
      return false;
    }
    Posting posting = (Posting) o;
    return id == posting.id;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return "Posting{" +
        "id=" + id +
        ", realname='" + realname + '\'' +
        ", screenname='" + screenname + '\'' +
        ", datetime=" + datetime +
        ", likes=" + likes +
        ", shares=" + shares +
        ", views=" + views +
        '}';
  }

  @Override
  public int compareTo(Posting o) {
    return Integer.compare(this.id,o.id);
  }

}
