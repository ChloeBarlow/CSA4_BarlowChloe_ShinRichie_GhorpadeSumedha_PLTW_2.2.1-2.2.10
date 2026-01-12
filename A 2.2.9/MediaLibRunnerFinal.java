public class MediaLibRunnerFinal {
  
  public static void main(String[] args) {
    
    // Note: the runner the instructions told me to copy on the PLTW document for step 25
    // had MediaLib code which I don't think was relevant in testing this program
    // so I copied over the code from MediaLibRunner instead.
    
    MediaLib myLib = new MediaLib();
    myLib.addSong(new Song("In Your Eyes"));
    System.out.println(myLib);
    myLib.addMovie(new Movie("Raiders of the Lost Ark", 1.9));
    System.out.println(myLib);
    myLib.addBook(new Book("1984", "Orwell"));
    System.out.println(myLib);
    
  }
}
