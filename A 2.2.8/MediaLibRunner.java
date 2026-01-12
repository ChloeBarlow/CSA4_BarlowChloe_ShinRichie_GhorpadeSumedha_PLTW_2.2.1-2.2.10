/*
 * Activity 2.2.7
 * 
 * The runner for the MediaLib program
 */
public class MediaLibRunner
{
  public static void main(String[] args)
  {
    System.out.println("Welcome to your Media Library");
    MediaLib myLib = new MediaLib();

    // New book
    Book myBook = new Book("The Lord of the Rings", "Tolkien");
    System.out.println("Book created " + myBook);

    // Initial check of library
    System.out.println("Library:\n" + myLib);
    
    // Add book and then check again
    myLib.addBook(myBook);
    System.out.println("Library:\n" + myLib);

    // Attempt to add rating, and check if it went through along with showing rating number
    int myRating = -1;
    myBook.adjustRating(myRating);
    System.out.println(myBook);
    System.out.println(myRating);

    // Book title change
    myBook.setTitle("Jujutsu Kaisen");
    System.out.println(myBook);
    System.err.println("Library:\n" + myLib);

    // Book author change
    myBook.setAuthor("Gege Akutami");
    System.out.println(myBook);
    System.err.println("Library:\n" + myLib);

    // Get book, change title, and display both book and library
    Book currBook = myLib.getBook();
    //currBook.setTitle("My Favorite Book");
    System.out.println("Current book: " + currBook);
    System.err.println("Library:\n" + myLib);

    // Create new library & book
    System.out.println("You have a NEW Library");
    MediaLib myLib2 = new MediaLib();
    Book newBook = new Book("To Kill a Mockingbird", "Lee");
    myLib2.addBook(newBook);
    System.out.println(myLib2);
    newBook = new Book("1984", "Orwell");
    System.out.println(myLib2);

    // Test testBook() method with newBook
    /*System.out.println("before test:" + newBook);
    myLib.testBook(newBook);
    System.out.println("after test:" + newBook);*/

    // Test equals method
    Book secnewBook = new Book("1984", "Orwell");
    System.out.println("New book: " + newBook + "\n2nd new book: " + secnewBook);
    System.err.println("2nd new book equals new book?: " + secnewBook.equals(newBook));
    secnewBook.setTitle("John");
    System.out.println("New book: " + newBook + "\n2nd new book: " + secnewBook);
    System.err.println("2nd new book equals new book?: " + secnewBook.equals(newBook));

    // Try to access book's private variable, exception rises from below statement
    //System.out.println(newBook2.title);
    
    // Add movie to media library and test methods
    Movie movie = new Movie("Godzilla Minus One", 2.08);
    System.out.println(movie.toString());
    Movie secmovie = new Movie("Godzilla Minus One", 2.08);
    System.out.println("First movie: " + movie + "\nSecond movie: " + secmovie);
    System.out.println("Movies are equal?: " + movie.equals(secmovie));
    secmovie.setTitle("Pacific Rim");
    secmovie.setLength(2.18);
    System.out.println("First movie: " + movie + "\nSecond movie: " + secmovie);
    System.out.println("Movies are equal?: " + movie.equals(secmovie));



    /*
     * Activity 2.2.8
     */

    // Observe how getOwner is invoked
    System.out.println(MediaLib.getOwner() + "'s Library");

    // Invoke changeOwner method with a new name
    MediaLib.changeOwner("Name");
    System.out.println(MediaLib.owner);

    // Directly accessing owner and changing value
    MediaLib.owner = "Name";
    System.out.println(MediaLib.owner);

    // Testing getNumEntries class method
    System.out.println(MediaLib.getNumEntries());

    // Create first media library and add a movie
    MediaLib lib1 = new MediaLib();
    lib1.addMovie("Impractical Jokers: The Movie");

    // Create second media library and add a book
    MediaLib lib2 = new MediaLib();
    lib2.addBook("Land of Stories");

    // Show contents of both libraries
    System.out.println(lib1);
    System.out.println(lib2);

    // Confirm number of entries for both libraries
    System.out.println(MediaLib.getNumEntries());

    // Add multiple books and movies to one of the libraries
    lib1.addMovie("Avengers: Endgame");
    lib1.addBook("Dork Diaries");

    // Display contents of all libraries + number of entries in them
    System.out.println(lib1);
    System.out.println(lib2);
    System.out.println(MediaLib.getNumEntries());

    // Add a song to the library
    lib1.addSong("New York, New York");

    // Testing getNumEntries methods for individual items
    System.out.println(MediaLib.getNumBookEntries());
    System.out.println(MediaLib.getNumMovieEntries());
    System.out.println(MediaLib.getNumSongEntries());

  }
}
