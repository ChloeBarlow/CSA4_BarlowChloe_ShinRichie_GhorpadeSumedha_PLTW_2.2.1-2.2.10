/*
 * Activity 2.2.2
 * 
 * A Player class the PhraseSolverGame
 */
import java.util.Scanner;

public class Player
{
  /* your code here - attributes */
  @SuppressWarnings("unused")
  private int score;
  private String name;

  /* your code here - constructor(s) */ 
  public Player()
  {
    score = 0;
    name = "";
    System.out.println("Please enter player's name: ");
    @SuppressWarnings("resource")
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
  public String getPlayer1Name() {
    return this.name;
  }

  public String getPlayer2Name() {
    return this.name;
  }

  public int getPlayer1Score() {
    return this.score;
  }

  public int getPlayer2Score () {
    return this.score;
  }

  /* your code here - mutator(s) */ 

    public void setScore(int score) {
        this.score = score;
    }
    public void setName(String name) {
      this.name = name;
    }
    public void addScore(int score) {
        this.score += score;
    }
}