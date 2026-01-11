/*
 * Activity 2.2.2
 *
 * A Board class the PhraseSolverGame
 */
import java.io.File;
import java.util.Scanner;

public class  Board
{
  private String solvedPhrase;
  @SuppressWarnings("FieldMayBeFinal")
  private String phrase;
  @SuppressWarnings("unused")
  private int letters; 

  /* your code here - constructor(s) */
  @SuppressWarnings("OverridableMethodCallInConstructor")
  public Board()
  {
    solvedPhrase = "";
    phrase = loadPhrase();
    setLetterValue();
    System.out.println("Phrase: " + phrase); //temp test code
  } 
  
  /* your code here - accessor(s) */
  public String getSolvedPhrase() {
    return this.solvedPhrase;
  }

  public String getPhrase() {
    return this.phrase;
  }

  public int getLetters() {
    return this.letters;
  }
  
  /* your code here - mutator(s)  */


  /* ---------- provided code, do not modify ---------- */
  public void setLetterValue()
  {
    int randomInt = (int) ((Math.random() * 10) + 1) * 100;    
    letters = randomInt;
  }

  public boolean isSolved(String guess)
  {
    return phrase.equals(guess);
  }

  @SuppressWarnings("UseSpecificCatch")
  private String loadPhrase()
  {
    String tempPhrase = "";
    
    int numOfLines = 0;
    try 
    {
      @SuppressWarnings("resource")
      Scanner sc = new Scanner(new File("phrases.txt"));
      while (sc.hasNextLine())
      {
        tempPhrase = sc.nextLine().trim();
        numOfLines++;
      }
    } catch(Exception e) { System.out.println("Error reading or parsing phrases.txt"); }
    
		int randomInt = (int) ((Math.random() * numOfLines) + 1);
    
    try 
    {
      int count = 0;
      @SuppressWarnings("resource")
      Scanner sc = new Scanner(new File("phrases.txt"));
      while (sc.hasNextLine())
      {
        count++;
        String temp = sc.nextLine().trim();
        if (count == randomInt)
        {
          tempPhrase = temp;
        }
      }
    } catch (Exception e) { System.out.println("Error reading or parsing phrases.txt"); }
    
    for (int i = 0; i < tempPhrase.length(); i++)
    {
      if (tempPhrase.substring(i, i + 1).equals(" "))
      {
        solvedPhrase += "  ";
      }  
      else
      {
        solvedPhrase += "_ ";
      }
    }  
    
    return tempPhrase;
  }  

  public boolean guessLetter(String guess)
  {
    boolean foundLetter = false;
    String newSolvedPhrase = "";
    
    for (int i = 0; i < phrase.length(); i++)
    {
      if (phrase.substring(i, i + 1).equals(guess))
      {
        newSolvedPhrase += guess + " ";
        foundLetter = true;
      }
      else
      {
        newSolvedPhrase += solvedPhrase.substring(i * 2, i * 2 + 1) + " ";  
      }
    }
    solvedPhrase = newSolvedPhrase;
    return foundLetter;
  } 
} 