package lab;

import java.util.Scanner;

public class GCD
{
   public static void main(String[] args)
   {
	
	  int gcd;
	  
	  do {
	   
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the first integer: ");
      int x = in.nextInt();
      System.out.println("x = " + x);
      System.out.println("Enter the second integer: ");
      int y = in.nextInt();
      System.out.println("y = " + y);  
      
      if (x > y) {
    	  gcd = x - y;
    	  x = gcd;
    	  System.out.println("The non-zero integer is " + x + ".");
      }
      else if (x < y) {
    	  gcd = y - x;
    	  y = gcd;
    	  System.out.println("The non-zero integer is " + y + ".");
      }
      else {
    	  gcd = 0;
    	  System.out.println("Program ended because loop's qualification failed.");
      }
      
     }while (gcd != 0);
    	
   }    
}