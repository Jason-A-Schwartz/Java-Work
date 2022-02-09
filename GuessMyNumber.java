// Jason Schwartz
// This program creates a guess my number game

// Import Scanner And Random

import java.util.Scanner;
import java.util.Random;

public class GuessMyNumber

{
  public static void main(String[] args)
  {
    // Declare Scanner And Random 

    Random random = new Random();
    Scanner keyboard = new Scanner (System.in);

// Declare Stored Number, Guessed Number, Answer

    int storedNumber;
    int guessedNumber;
    String answer;

    // Generate Random Number 

    int num = random.nextInt(10);
      
      //Random number between 1 and 10 (including both 1 and 10);

      int large = 10;
      int small = 1;
      int range = large - small + 1;

      do
      {
  
      num = random.nextInt( range ); // generates a ca

      num = num + small;
      
      // Store Random Number into StoredNumber

      storedNumber = num;

      //Get User Input

      System.out.println("Hello, Please Guess A Number Between 1 And 10 (Inclusive)");

      guessedNumber = keyboard.nextInt();

      // Write If/Else If Statements For Right Answer And Wrong Answer


      if (guessedNumber != storedNumber)
      
      {

          System.out.println("Sorry, You Gussed Incorrectly. The Number Was: " + num);

      }

      else if (guessedNumber == storedNumber)

      {

          System.out.println("Congrats You Guessed The Right Number!");

      }
          // Write Do While Loop For Playing Again
          do{

            System.out.println("Would You Like To Play Again? (Y/N)");
            answer = keyboard.next();

          }while((!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("No") || answer.equalsIgnoreCase("n"))));

    }while(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y"));

    // Write If Statement For If User Says No

    if (answer.equalsIgnoreCase("No") || answer.equalsIgnoreCase("n"));
    {
      System.out.println("Thank's For Playing");
    }

    // Close Keyboard
    
    keyboard.close();
  }
}