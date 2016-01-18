package labs;

import java.util.Scanner;
public class Planets
{
   public static void main(String[] args)
   {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter a planet number from the sun:  ");
       System.out.println("1.Mercury 2.Venus 3.Earth 4.Mars 5.Jupiter 6.Saturn 7.Uranus 8.Neptune");
       int planet = scan.nextInt();
       if (planet == 1) System.out.println ("The planet is Mercury.");
       if (planet == 2) System.out.println ("The planet is Venus.");
       if (planet == 3) System.out.println ("The planet is Earth.");
       if (planet == 4) System.out.println ("The planet is Mars.");
       if (planet == 5) System.out.println ("The planet is Jupiter.");
       if (planet == 6) System.out.println ("The planet is Saturn.");
       if (planet == 7) System.out.println ("The planet is Uranus.");
       if (planet == 8) System.out.println ("The planet is Neptune.");
       else System.out.println("Error: invalid integer");
       
   }
}