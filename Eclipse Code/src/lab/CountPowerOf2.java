package lab;

import java.util.Scanner;

public class CountPowerOf2
{
	
	public static void main(String[] args) 
	{
	   int i = 1;
	   while (i <= 10) {
		   i++; 
		   System.out.println(i + " squared equals " + i * i); 
	   }

	} 
	
//   public static void main(String[] args) 
//   {
//      Scanner in = new Scanner(System.in);
//      System.out.print("Please enter a number, 0 to quit: "); 
//      int n = in.nextInt();
//      
//      for (int i = 1; n * n > Math.pow(2, i); i++) {
//    	  System.out.println("2 raised to " + i + " is the first power of two greater than " + n + " squared"); 
//      }
//    	   
//   }
} 
