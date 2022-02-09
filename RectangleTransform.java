// Jason Schwartz
// This Program Creates A Rectangle, Copies It, Shrinks It, Get It's Corner Points, And Calculates It's

// These Import Statements Are Needed For Running The Code

import java.awt.Rectangle;
import java.awt.Point;

public class RectangleTransform
{
    public static void main(String[] args)

    {

        // This Creates A Rectangle Whose Top Left Point Is (0,0) And Has A Width Of 100 And A Height Of 200

       Rectangle box = new Rectangle(0, 0, 100, 200);

       // Task 1: Object As An Input Parameter, This Task Will Use The "getArea" Method To Get The Area Of The Rectangle 

       // This prints the Area of The Rectangle Which Is Pulled From The "getArea" Method

       System.out.println("Task #1: The Area Of The Rectangle Is: " + getArea(box));

       // Task 2: Object As A Return Type, This Task Will Use The "getPoints" Method To Get The Points Of The Rectangle

       // Creates A points Array

       Point[] pts = getPoints(box);
       
       // This If Statement States The Points Of The Rectangle If "pts != null"

       if (pts != null)

       {

           System.out.println("Task #2: The Lower Left Point Is Located At: " + pts[0]);

           System.out.println("Task #2: The Top Left Point Is Located At: " + pts[1]);

           System.out.println("Task #2: The Top Right Point Is Located At: " + pts[2]);

           System.out.println("Task #2: The Lower Right Point Is Located At: " + pts[3]);

        }

        // This Else Statement Will Print "Rectangle Points Are Unkown" If pts = null

        else
        
        System.out.println("Task #2: The Rectangle Points Are Unknown");

       // Task 3: Mutable Object, This Task Will Shrink The Box Height/Width By 50%

       // Declares old_width And old_height And Assigns Them To The Rectangle Width/Height

       int old_width = box.width;

       int old_height = box.height;

       // Calls The Shrink Method With The Rectangle's Old Width/Old Height

       shrink(box);

       // Prints The Width/Height Change 

       System.out.println("Task #3: The Width Changed From " + old_width + " To " + box.width);

       System.out.println("Task #3: The Height Changed From " + old_height + " To " + box.height);

       // Task 4: Aliasing, This Task Will Copy The Rectangle And Shrink The Copy Only
       
       // Creates A "new_box" Object And Calls The "copy_and_shrink" Method With The Original Rectangle To Make A Copy Of The New Box And Shrink It

       Rectangle new_box = copy_and_shrink(box);

       // Prints The Area Of The Old Box

       System.out.println("Task #4: The Area Of The Old Box Is: " + getArea(box));

       // Prints The Area Of The New Box

       System.out.println("Task #4: The Area Of The New Box Is: " + getArea(new_box));
   }
   
   // Task 1: Object As An Input Parameter, Complete The Method To Calculate The Area Of A Rectangle

   // This Method Gets The Height/Width Of The Rectangle And Returns The Area

   public static double getArea(Rectangle rect)

   {
       // Gets The Height/Width And Calculates The Area

       double area = rect.getHeight() * rect.getWidth();

       // Returns The Area Of The Rectangle

       return area;
   }

   // Task 2: Object As A Return Type Complete The Method To Return All Four Points That Define The Rectangle
   
   public static Point[] getPoints(Rectangle rect) 
   {
       // This Creates A New Array With 4 Point Inputs

       Point[] pts = new Point[4];

       // Assigns The Bottom Left Point (p0)

       pts[0] = new Point(rect.x, rect.y);

       // Assigns The Top Left Point (p1)
       
       pts[1] = new Point(rect.x, rect.y + rect.height);

       // Assigns The Top Right Point (p2)

       pts[2] = new Point(rect.x + rect.width, rect.y + rect.height);

       // Assigns The Lower Right Point (p3)

       pts[3] = new Point(rect.x + rect.width, rect.y);

       // Returns The Points Coordinates

       return pts; 
   }

   // Task 3: Mutable Object, This Method
   
   public static void shrink(Rectangle rect) 
   {
       // Reduces Height And Width Of The Rectangle By 50%

       rect.height = (int) ((rect.getHeight()*50)/100);

       rect.width = (int) ((rect.getWidth()*50)/100);

   }

   // Task 4: Object Aliasing, This Method Gets The "original_rectangle" And Copies/Shrinks It

   public static Rectangle copy_and_shrink(Rectangle original_rectangle)

   {
       // Creates New Object For Rectangle Copy Based Off OF Original Rectangle

       Rectangle new_rectangle = new Rectangle(original_rectangle);

       // Reduces Height And Width Rectangle Copy By 50%

       new_rectangle.height = (int) ((new_rectangle.getHeight()*50)/100);

       new_rectangle.width = (int) ((new_rectangle.getWidth()*50)/100);

       // Returns Shrunk Rectangle Copy 

       return new_rectangle;
       
   }
}
