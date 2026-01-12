public class Movie 
{
    private String title;
    private double length;
    private Integer rating;

    public Movie(String t, double h)
  {
    title = t;
    length = h;
    rating = 0;
  }

  /*** Accessor methods ***/
  public String getTitle() {
    return title;
  }

  public double getLength() {
    return length;
  }
  
  public int getRating() {
    return rating;
  }
  
    @SuppressWarnings("override")
  public String toString() 
  {
    String info = "\"" + title + "\", " + length + " hours long";
    if (rating != 0) 
    { 
      info += ", rating is " + rating;
    }
    return info;
  }

  public boolean equals(Movie m){
    if ((this.title.equals(m.title)) && (this.length == m.length)){
		  return true;
	  } else {
		  return false;
	  }
  }

  /*** Mutator methods ***/
  public void setTitle(String t) {
    title = t;
  }

  public void setLength(double h) {
    length = h;
  }

  public void adjustRating(Integer r){
    if ((r >= 0) && (r <= 10)){
      rating += r;
    }
  }
}