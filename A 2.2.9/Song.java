/*
 * Activity 2.2.7
 *
 * A Song class for the MediaLibrary program
 */
public class Song
{
  private String title;
  private int rating;
  
  /*** Constructor ****/
  public Song(String t)
  {
    title = t;
    rating = 0;
  }
  
   /*** Accessor methods ***/
  public String getTitle() {
    return title;
  }
  
  public int getRating() {
    return rating;
  }
  
  @SuppressWarnings("override")
  public String toString() 
  {
    String info = "\"" + title + "\"";
    if (rating != 0) 
    { 
      info += ", rating is " + rating;
    }
    return info;
  }

  public boolean equals(Song s){
      return this.title.equals(s.title);
  }

  /*** Mutator methods ***/
  public void setTitle(String t) {
    title = t;
  }

  public void adjustRating(Integer r){
    if ((r >= 0) && (r <= 10)){
      rating += r;
    }
  }
}