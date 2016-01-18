package labs;

import java.util.Scanner;
public class SmallestInt
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter a value for x:");
      int x = scan.nextInt();
      System.out.println("Enter a value for y:");
      int y = scan.nextInt();
      System.out.println("Enter a value for z:");
      int z = scan.nextInt();
      if (x <= y)
      {
         System.out.println("The smallest value was " + x);
      }
      if(x <= z)
      {
    	  System.out.println("The smallest value was " + x);
      }
      if(y <= x)
      {
    	  System.out.println("The smallest value was " + y);
      }
      if(y <= z)
      {
    	  System.out.println("The smallest value was " + y);
      }
      if(z <= x)
      {
    	  System.out.println("The smallest value was " + z);
      }
      if(z <= y)
      {
    	  System.out.println("The smallest value was " + z);
      }
   }
}