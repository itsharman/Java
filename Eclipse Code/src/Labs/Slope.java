package labs;

import java.util.Scanner;

public class Slope 
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      System.out.print("Input x coordinate of the first point: ");
      double xcoord1 = in.nextDouble();

      System.out.print("Input y coordinate of the first point: ");
      double ycoord1 = in.nextDouble();

      System.out.print("Input x coordinate of the second point: ");
      double xcoord2 = in.nextDouble();

      System.out.print("Input y coordinate of the second point: ");
      double ycoord2 = in.nextDouble();
      
      if (xcoord1 == xcoord2) {
    	  System.out.println("Error: denominator not allowed to be zero");
      }
      
      else {
    	  double slope = (ycoord2 - ycoord1) / (xcoord2 - xcoord1);        
          System.out.println("The slope of the line is " + slope);
      }
  
   } 
}
