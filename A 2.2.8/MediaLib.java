/*
 * Activity 2.2.7
 * 
 * A MediaLib class for the MediaLibrary program
 */
public class MediaLib
{
  private Book book;
  private Movie movie;
  private Song song;
  @SuppressWarnings("FieldMayBeFinal")
  public static String owner = "PLTW";
  private static int numEntries;
  private static int numBookEntries;
  private static int numMovieEntries;
  private static int numSongEntries;

  public void addBook(Book b)
  {
    if (book == null) {
        book = b;
        numBookEntries++;
        numEntries++;
    } else {
        System.out.println("Sorry! You have already added a book to this library.");
    }
  }

  public void addMovie(Movie m)
  {
    if (movie == null) {
        movie = m;
        numMovieEntries++;
        numEntries++;
    } else {
        System.out.println("Sorry! You have already added a movie to this library.");
    }
  }

  public void addSong(Song s)
  {
    if (song == null) {
        song = s;
        numSongEntries++;
        numEntries++;
    } else {
        System.out.println("Sorry! You have already added a song to this library.");
    }
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

  @SuppressWarnings("override")
  public String toString() 
  {
    if (book != null) {
        String info = book.toString();
        return info;
    } else if (movie != null) {
        String info = movie.toString();
        return info;
    } else if (song != null) {
        String info = song.toString();
        return info;
    } else {
        return "Empty";
    }
  }



  /*
   * Activity 2.2.8
   */

  public static String getOwner() {
    return owner;
  }

  public static void changeOwner(String newOwner) {
    owner = newOwner;
  }

  public static int getNumEntries() {
    return numEntries;
    // System.out.println("Test: Owner is " + owner);
    // System.out.println("Test: Book is " + book);
    // System.out.println("Test: Movie is " + movie);
    // System.out.println("Test: MediaLib is " + this.book);
  }

  public static int getNumBookEntries() {
    return numBookEntries;
  }

  public static int getNumMovieEntries() {
    return numMovieEntries;
  }

  public static int getNumSongEntries() {
    return numSongEntries;
  }

}