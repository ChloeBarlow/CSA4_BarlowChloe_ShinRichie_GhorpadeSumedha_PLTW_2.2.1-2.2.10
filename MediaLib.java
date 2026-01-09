/**
 * Activity 2.2.7
 * 
 * A MediaLib class for the MediaLibrary program
 */
public class MediaLib
{
  private Book book;
  private Movie movie;

  public void addBook(Book b)
  {
    book = b;
  }

  public void addMovie(Movie m)
  {
    movie = m;
  }

  public Book getBook()
  {
    return book;
  }

  public void testBook(Book tester)
  {
    tester.setTitle("Jojo's Bizarre Adventure");
    System.out.println(tester.toString());
  }

  public String toString() 
  {
    if (book != null){
      String info = book.toString();
      return info;
    } else if (movie != null) {
      String info = movie.toString();
      return info;
    } else {
      return "Empty";
    }
  }
}