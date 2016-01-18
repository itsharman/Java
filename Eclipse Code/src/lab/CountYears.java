package lab;

import java.util.Scanner;

/**
Counts the number of years from a year input by the user
until the year 3000. 
*/ 
public class CountYears
{
public static void main(String[] args) 
{
   int millennium = 3000;
   Scanner in = new Scanner(System.in);
   System.out.print("Please enter the current year: ");

   int year = in.nextInt();
   int nyear = year;

   while (nyear < millennium)
   {
      nyear++;
   }
   
   if (nyear > millennium)
   {
	   System.out.println("You can't go back in time!");
   }
   
   else {
	   System.out.println("Another " + (nyear - year) + " years to the millennium.");   
   }

}
}