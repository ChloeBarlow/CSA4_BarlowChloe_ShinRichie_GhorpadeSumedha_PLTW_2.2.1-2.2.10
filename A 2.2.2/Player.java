/*
 * Activity 2.2.2
 * 
 * A Player class the PhraseSolverGame
 */
import java.util.Scanner;

public class Player
{
  /* your code here - attributes */
  private int score;
  private String name;

  /* your code here - constructor(s) */ 
  public Player()
  {
    score = 0;
    name = "";
    System.out.println("Please enter player's name: ");
    Scanner input = new Scanner(System.in);
    name = input.nextLine();
    System.out.println("Welcome to the game, " + name + "!");
  }

  public Player(String inputName)
  {
    score = 0;
    name = inputName;
    System.out.println("Welcome to the game, " + name + "!");
  }

  /* your code here - accessor(s) */ 

  /* your code here - mutator(s) */ 
}