// Jason Schwartz
// This program determines odd or even

// Import Scanner

import java.util.Scanner;

public class OddOrEven
{
  public static void main(String[] args)
  {

    // Declare Variable

    int userInput;

    // Declare Scanner

    Scanner keyboard = new Scanner (System.in);
    
    // Loop for Positive Integer

    do
    {

      System.out.println("Please Enter A Positive Integer");

      userInput = keyboard.nextInt();

      // Escape If Statement For Negative Integer

      if (userInput < 0)
    {
      System.out.println("Good Bye :)");
      System.exit(0);
    }
      // Determine If Number Is Even

      if(userInput % 2 == 0)

      {

        System.out.println("Even Number");

      }

      // Determine If Number Is Odd

      if (userInput % 2 == 1)

    {
        System.out.println("Odd Number");

        
    }

    } while (userInput % 2 == 0 || userInput % 2 == 1);

    // Close Keyboard
    
    keyboard.close();

  }
}