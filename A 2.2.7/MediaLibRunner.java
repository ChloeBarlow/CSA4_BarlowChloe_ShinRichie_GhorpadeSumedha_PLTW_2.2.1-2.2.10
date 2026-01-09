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
  }
}