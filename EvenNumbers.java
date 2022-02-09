// Jason Schwartz
// This program determines even numbers

// Import Scanner 

import java.util.Scanner;

public class EvenNumbers
{
  public static void main(String[] args)
  {

    // Declare User Inputs

    int iOne;
    int iTwo;

    // Declare Keybaord Scanner 

    Scanner keyboard = new Scanner (System.in);

    // Get User Input 1 and 2

    System.out.println("Please Enter An Integer: ");
    iOne = keyboard.nextInt();

    System.out.println("Please Enter Another Integer: ");
    iTwo = keyboard.nextInt();

    // Write If Statement For Larger First Integer
    if (iOne > iTwo)
    {
        System.out.println("Invalid Input: Second Integer Can Not Be Larger Than First Integer");
    }

    // Write Else If For Positive Integers Inclusive

    else if (iOne < iTwo)
    {
        System.out.println("Positive Integers Inbetween Your Given Integers (Inclusive): ");
    }

    // Set K for Integer One Remainder Integer Two

    int k = iOne % iTwo;
    
    // Close Keyboard

    keyboard.close();

    //Loop that is less then or equal to end

    while (iOne <= iTwo) 
    {
        if (iOne % 2 == 0)
          System.out.println(iOne);
        iOne = iOne + 1;

      }
 {
   // For Loop To Repeat Till Finished Going Through Even User Given Numbers
      for (int i = iOne; i <= iTwo; i = i + k)
            System.out.println(i); 
        }
  }
}