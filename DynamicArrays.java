// Jason Schwartz
// Prints An Array 5 times Dynamically

public class DynamicArrays

{
    public static void main(String[] args)

   {

     //Array

     // Creates An Object

     MyArrayListDynamic list1 = new MyArrayListDynamic ();
  
     System.out.println("---------------------");    

     System.out.println("Initial Array");

     list1.print();
     
     System.out.println("---------------------");    

     System.out.println("Update Array: Change value in index 2 to 7");

     //Change value in index 2 changes from 5 to 7

     MyArrayListStatic.update(2,7); 

     list1.print();
     
     System.out.println("---------------------");   

     System.out.println("Add value 3 to the end of the array");

     //Add value 3 to the end of the array

     MyArrayListStatic.add(3);

     list1.print();
     
     System.out.println("---------------------");    

     System.out.println("Insert value 9 into index 3");

     //Insert value 9 into index 3 

     MyArrayListStatic.insert(3,9);

     list1.print();
     
     System.out.println("---------------------");

     System.out.println("Delete the value in index 3");

     //Delete the value in index 3

     MyArrayListStatic.delete(3);

     list1.print();

    }
   
   }
   
 