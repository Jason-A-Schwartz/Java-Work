// Jason Schwartz
// Lab three pizza order program

import java.util.Scanner;  // Needed for the Scanner class
import java.text.DecimalFormat;

/**
   This program allows the user to order a pizza.
*/

public class PizzaOrder
{
   public static void main (String[] args)
   {
      // Create a Scanner object to read input.

      Scanner keyboard = new Scanner (System.in);

      String firstName;             // User's first name
      boolean pizzaDiscount;             // Flag for discount
      int inches;                   // Size of the pizza
      char crustType;               // For type of crust
      String Crust = "Hand-Tossed";                 // Name of crust
      double cost = 12.99;                  // Cost of the pizza
      final double TAX_RATE = (.08);  // Sales tax rate
      double tax = 0.00;                   // Amount of tax
      char choice;                  // User's choice
      String input;                 // User input
      String toppings = "Cheese ";              // List of toppings
      int numberOfToppings = 0;         // Number of toppings
      double totalPrice;             //Tax + Cost
      DecimalFormat twoDForm = new DecimalFormat("#.00"); // 2 Deciaml Points

      
      // Prompt user and get first name.

      System.out.println("Welcome to Mike and " + "Diane's Pizza");
      System.out.print("Enter your first name: ");
      firstName = keyboard.nextLine();

      // Determine if user is eligible for discounts
      // Task 1 Code:

      if (firstName.equalsIgnoreCase("Mike") || (firstName.equalsIgnoreCase("Diane")))
      {
          pizzaDiscount = true;
          System.out.println("You Just Saved $2.00");
      }
      else
      {
          pizzaDiscount = false;
      }
      
      // Prompt user and get pizza size choice.

      System.out.println("Pizza Size (inches)   Cost");
      System.out.println("        10            $10.99");
      System.out.println("        12            $12.99");
      System.out.println("        14            $14.99");
      System.out.println("        16            $16.99");
      System.out.println("What size pizza " + "would you like?");
      System.out.print("10, 12, 14, or 16 " + "(enter the number only): ");
      inches = keyboard.nextInt();

      // Set price and size of pizza ordered.
      // Task 2 Code:

      if (inches == 10)
      {
          cost = 10.99;
      }
      else if (inches == 12)
      {
          cost = 12.99;
      }
      else if (inches == 14)
      {
          cost = 14.99;
      }
      else if (inches == 16)
      {
          cost = 16.99;
      }
      else
      {
          System.out.println("Pizza Size Was Invalid, 12 Inch Pizza Has Been Chosen");
          cost = 12.99;
      }

      // Consume the remaining newline character.

      keyboard.nextLine();
    
      // Prompt user and get crust choice.

      System.out.println("What type of crust " + "do you want? ");
      System.out.print("(H) Hand-tossed, " + "(T) Thin-crust, or " + "(D) Deep-dish " + "(enter H, T, or D): ");
      input = keyboard.nextLine();
      crustType = input.charAt(0);

      // Set user's crust choice on pizza ordered.
      // Task 3 Code:

      if (crustType == 'H' || crustType == 'h')
      {

          Crust = "Hand-tossed";

      }
      else if (crustType == 'T' || crustType == 't')

      {
          Crust = "Thin-Crust";

      }
      else if (crustType == 'D' || crustType == 'd')
      {
          Crust = "Deep-Dish";

      }

      // Prompt user and get topping choices one at a time.

      System.out.println("All pizzas come with cheese.");
      System.out.println("Additional toppings are " + "$1.25 each, choose from:");
      System.out.println("Pepperoni, Sausage, " + "Onion, Mushroom");

      // If topping is desired,
      // add to topping list and number of toppings

      System.out.print("Do you want Pepperoni? (Y/N): ");
      input = keyboard.nextLine();
      choice = input.charAt(0);
      if (choice == 'Y' || choice == 'y')
      {
         numberOfToppings += 1;
         toppings = toppings + "Pepperoni ";
      }
      System.out.print("Do you want Sausage? (Y/N): ");
      input = keyboard.nextLine();
      choice = input.charAt(0);
      if (choice == 'Y' || choice == 'y')
      {
         numberOfToppings += 1;
         toppings = toppings + "Sausage ";
      }
      System.out.print("Do you want Onion? (Y/N): ");
      input = keyboard.nextLine();
      choice = input.charAt(0);
      if (choice == 'Y' || choice == 'y')
      {
         numberOfToppings += 1;
         toppings = toppings + "Onion ";
      }
      System.out.print("Do you want Mushroom? (Y/N): ");
      input = keyboard.nextLine();
      choice = input.charAt(0);
      if (choice == 'Y' || choice == 'y')
      {
         numberOfToppings += 1;
         toppings = toppings + "Mushroom ";
      }

      // Add additional toppings cost to cost of pizza.
      cost = cost + (1.25 * numberOfToppings);

      // Display order confirmation.
      System.out.println();
      System.out.println("Your order is as follows: ");

      if (inches != 10 && inches != 12 && inches != 14 && inches != 16)
      {
        System.out.println("12 inch pizza");

      }
      else
      {
        System.out.println(inches + " inch pizza");
      }

      System.out.println(Crust + " crust");
      System.out.println(toppings + " ");

      // Apply discount if user is eligible.
      // Task 4 Code:

      if (pizzaDiscount == true)
      {
          cost = cost - 2;
      }
      

      // EDIT PROGRAM FOR TASK #5
      // SO ALL MONEY OUTPUT APPEARS WITH 2 DECIMAL PLACES

      tax = (tax) * 100D /100D;
      cost = (cost) * 100D /100D;
      System.out.print("The cost of your order " + "is:  $"); System.out.print(twoDForm.format(cost));
      System.out.println();

      // Calculate and display tax and total cost.
      tax = ((cost) * (TAX_RATE));
      System.out.print("The tax is:  $"); System.out.print(twoDForm.format(tax));
      System.out.println();
      totalPrice = ((tax + cost) * 100D) /100D;
      System.out.print("The total due is:  $"); System.out.print(twoDForm.format(totalPrice));
      System.out.println();
      System.out.println("Your order will be ready " + "for pickup in 30 minutes.");

      keyboard.close();
      
   }
}