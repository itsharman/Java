package labs;

import java.util.*;
public class SmallestInt2
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter a value for w:");
      int w = scan.nextInt();
      int smallest = w;  
      System.out.println("Enter a value for x:");
      int x = scan.nextInt();
      if (x < smallest)
      {
         smallest = x; 
      }
      System.out.println("Enter a value for y:");
      int y = scan.nextInt();      
      if (y < smallest)
      {
         smallest = y; 
      }
      System.out.println("Enter a value for z:");
      int z = scan.nextInt();      
      if (z < smallest)
      {
         smallest = z; 
      }
      System.out.println("The smallest integer value was " + smallest + ".");
      // It wouldn't be too much harder. It would just be a lot more annoying. As with my previous method, 
      // I would have to implement each possible outcome. With four variables, the outcomes increase exponentially.
   }
}
