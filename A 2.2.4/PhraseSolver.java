/*
 * Activity 2.2.2
 *
 *  The PhraseSolver class the PhraseSolverGame
 */
import java.util.Scanner;
  
public class PhraseSolver
{
  /* your code here - attributes */
  private Player player1;
  private Player player2;
  private Board game;
  private boolean solved;
  private String action;

  /* your code here - constructor(s) */ 
  public PhraseSolver()
  {
    player1 = new Player();
    player2 = new Player();
    game = new Board();
    solved = false;
  }


  public void play()
  {
    boolean solved = false;
    int currentPlayer = 1;

    @SuppressWarnings("unused")
    Scanner input = new Scanner(System.in);
    
    @SuppressWarnings("unused")
    boolean correct = true;
    while (!solved) 
    {
      /* your code here - game logic */
      if ((currentPlayer % 2) == 1) {
        System.out.println("It is your turn, " + player1.getPlayer1Name());
        System.out.println("Please enter an action, L for letter and P for phrase: ");
        action = input.next();
        action = action.toUpperCase();
        if (action.equals("L")){
          System.out.println("Please enter letter to guess: ");
          action = input.next();
          System.out.println("Is letter in phrase?");
            if (game.guessLetter(action) == true) {
              player1.addScore(1); 
              System.err.println(game.getSolvedPhrase());
              System.err.println(player1.getPlayer1Name() + "'s score: " + player1.getPlayer1Score());
            } else {
              System.err.println("Nope, tough luck");
            }
        } else if (action.equals("P")) {
          System.out.println("Please enter phrase to guess: ");
          action = input.nextLine();
          System.out.println("Is this the phrase? ");
            if (action.equals(game.getPhrase())) { 
              player1.addScore(100);
              solved = true;
              game.solvePhrase();
              System.err.println(game.getSolvedPhrase());
            } else {
              System.err.println("Nope, tough luck");
            }
        }
        } else if ((currentPlayer % 2) == 0) {
        System.out.println("It is your turn, " + player2.getPlayer2Name());
        System.out.println("Please enter an action, L for letter and P for phrase: ");
        action = input.next();
        action = action.toUpperCase();
        if (action.equals("L")){
          System.out.println("Please enter letter to guess: ");
          action = input.next();
          System.out.println("Is letter in phrase?");
            if (game.guessLetter(action) == true) {
              player2.addScore(1); 
              System.err.println(game.getSolvedPhrase());
              System.err.println(player2.getPlayer2Name() + "'s score: " + player2.getPlayer2Score());
            } else {
              System.err.println("Nope, tough luck");
            }
        } else if (action.equals("P")) {
          System.out.println("Please enter phrase to guess: ");
          action = input.nextLine();
          System.out.println("Is this the phrase? ");
            if (action.equals(game.getPhrase())) { 
              player2.addScore(100);
              solved = true;
              game.solvePhrase();
              System.err.println(game.getSolvedPhrase());
            } else {
              System.err.println("Nope, tough luck");
            }
          }
      }
      
      /* your code here - determine how game ends */
      if (game.getSolvedPhrase().equals(game.getPhrase()) || solved == true) {
        break;
      }
      currentPlayer++;
    } 
    System.err.println("Final Scores");
    System.err.println(player1.getPlayer1Name() + "'s score: " + player1.getPlayer1Score());
    System.err.println(player2.getPlayer2Name() + "'s score: " + player2.getPlayer2Score());
  }
  
}