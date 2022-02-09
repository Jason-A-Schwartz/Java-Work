// Jason Schwartz
// Lab Six Geometry

import java.util.Scanner;

/**
 *  This program demonstrates static methods
*/

public class Geometry
{
   public static void main(String[] args)

   {

      int choice;       // The user's choice
      double value = 0; // The method's return value
      char letter;      // The user's Y or N decision
      double radius;    // The radius of the circle
      double length;    // The length of the rectangle
      double width;     // The width of the rectangle
      double height;    // The height of the triangle
      double base;      // The base of the triangle
      double side1;     // The first side of the triangle
      double side2;     // The second side of the triangle
      double side3;     // The third side of the triangle

      // Create a scanner object to read from the keyboard

      Scanner keyboard = new Scanner(System.in);

      // The do loop allows the menu to be displayed first

      do

      {
         // TASK #1 Call the printMenu method
         
         printMenu();

         choice = keyboard.nextInt();

         switch(choice)

         {

            case 1:

               System.out.print("Enter the radius of " + "the circle: ");

               radius = keyboard.nextDouble();

               // TASK #3 Call the circleArea method and and store the result in the "value" variable
               
               value = circleArea(radius);

               System.out.println("The area of the " + "circle is " + value);

               break;
               
            case 2:

               System.out.print("Enter the length of " + "the rectangle: ");

               length = keyboard.nextDouble();

               System.out.print("Enter the width of " + "the rectangle: ");
               
               width = keyboard.nextDouble();

               // TASK #3 Call the rectangleArea method and store the result in the "value" variable
               
               value = rectangleArea(length, width);

               System.out.println("The area of the " + "rectangle is " + value);

               break;

            case 3:

               System.out.print("Enter the height of " + "the triangle: ");

               height = keyboard.nextDouble();

               System.out.print("Enter the base of " + "the triangle: ");

               base = keyboard.nextDouble();

               // TASK #3 Call the triangleArea method and and store the result in the "value" variable
               
               value = triangleArea(height, base);

               System.out.println("The area of the " + "triangle is " + value);

               break;

            case 4:

               System.out.print("Enter the radius of " + "the circle: ");

               radius = keyboard.nextDouble();

               // TASK #3 Call the circumference method and and store the result in the "value" variable
               
               value = circumference(radius);

               System.out.println("The circumference " + "of the circle is " + value);

               break;

            case 5:

               System.out.print("Enter the length of " + "the rectangle: ");

               length = keyboard.nextDouble();

               System.out.print("Enter the width of " + "the rectangle: ");

               width = keyboard.nextDouble();

               // TASK #3 Call the perimeter method and and store the result in the "value" variable
               
               value = rectanglePerimeter(length, width);

               System.out.println("The perimeter of " + "the rectangle is " + value);

               break;

            case 6:

               System.out.print("Enter the length of " + "side 1 of the " + "triangle: ");

               side1 = keyboard.nextDouble();

               System.out.print("Enter the length of " + "side 2 of the " + "triangle: ");

               side2 = keyboard.nextDouble();

               System.out.print("Enter the length of " + "side 3 of the " + "triangle: ");

               side3 = keyboard.nextDouble();

               // TASK #3 Call the perimeter method and and store the result in the "value" variable
               
               value = trianglePerimeter(side1, side2, side3);

               System.out.println("The perimeter of " + "the triangle is " + value);
               break;

            default:
               System.out.println("You did not enter " + "a valid choice.");

         }

         keyboard.nextLine(); // Consume the new line

         System.out.println("Do you want to exit " + "the program (Y/N)?: ");

         String answer = keyboard.nextLine();

         letter = answer.charAt(0);

      } while(letter != 'Y' && letter != 'y');

      keyboard.close();

   }

   // TASK #1 Create the printMenu method here

   public static void printMenu()
   
   {

      System.out.println("This is a geometry caclulator");
      System.out.println("Choose what you would like to caculate:");
      System.out.println("1. Find the area of a circle");
      System.out.println("2. Find the area of a rectangle");
      System.out.println("3. Find the area of a triangle");
      System.out.println("4. Find the circumfrence of a circle");
      System.out.println("5. Find the perimeter of a rectangle");
      System.out.println("6. Find the perimeter of a triangle");
      System.out.println("Enter the number of your choice");

}

   // TASK #2 Create the value-returning methods here
   
   // TASK #4 Write javadoc comments for each method

/**
 * The circleArea requires the user to input the radius of a circle
 * The circleArea method then returns the area of a circle
 * @param radius This is the radius of the circle
 * @return This is the area of the circle
 */

   public static double circleArea(double radius)

   {

         double area;
         area = Math.PI*Math.pow(radius, 2);
         return area;

}

// TASK #4 Write javadoc comments for each method

/**
 * The rectangleArea requires the user to input the length and the width of a rectangle
 * The rectangleArea method then returns the area of a rectangle
 * @param length This the length of the rectangle
 * @param width This is the width of the rectangle
 * @return This is the area of the rectangle
 */

public static double rectangleArea(double length, double width)

{

      double area;
      area = (length * width);
      return area;

}

// TASK #4 Write javadoc comments for each method

/**
 * The triangleArea requires the user to input the height and base of a triangle
 * The triangleArea method then calculates the area of a triangle
 * @param height This is the height of the triangle
 * @param base This is the base of the triangle
 * @return This is the area of the triangle
 */

public static double triangleArea(double height, double base)

{

      return (height/base) * 0.5;

}

// TASK #4 Write javadoc comments for each method

/**
 * The circumference requires the user to input the radius of a circle
 * The circumference method then returns the circumference of a circle
 * @param radius This is the radius of the circle
 * @return This is the circumference of the circle
 */

public static double circumference(double radius)

{

      return (2 * Math.PI * radius);

}

// TASK #4 Write javadoc comments for each method

/**
 * The rectanglePerimeter requires the user to input the length and width of a rectangle
 * The rectanglePerimeter method then calculates the perimeter of a rectangle
 * @param length This is the length of the rectangle
 * @param width This is the width of the rectangle
 * @return This is the perimeter of the rectangle
 */

public static double rectanglePerimeter(double length, double width)

{

      return ((2 * length) + (2 * width));
      
}

// TASK #4 Write javadoc comments for each method

/**
 * The trianglePerimeter requires the user to input side 1, side 2, and side 3 of a triangle
 * The trianglePerimeter method then calculates the perimeter of a triangle
 * @param side1 This is the length of the first side of the triangle
 * @param side2 This is the length of the second side of the triangle
 * @param side3 This is the length of the thrid side of the triangle
 * @return This is the perimeter of the triangle
 */ 

public static double trianglePerimeter(double side1, double side2, double side3)

{

      return side1 + side2 + side3;

}
}