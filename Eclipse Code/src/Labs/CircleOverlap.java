package labs;

import java.util.Scanner;

public class CircleOverlap
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      System.out.print("Input the radius of the first circle: ");
      double radius1 = in.nextDouble(); 
      System.out.print("Input the x coord. of the first circle: ");
      double xcenter1 = in.nextDouble();
      double ycenter1 = 0;
      System.out.print("Input the radius of the second circle: ");
      double radius2 = in.nextDouble(); 
      System.out.print("Input the x coord. of the second circle: ");
      double xcenter2 = in.nextDouble();
      double ycenter2 = 0;

     if (radius1 < radius2 || radius2 < radius1) {
    	 System.out.println("Mutually contained");
     }
     else if (radius1 == radius2 || radius2 == radius2) {
    	 System.out.println("Overlapping");
     }
     else if (xcenter1 != xcenter2)
    	 System.out.println("Disjoint");
     }
     
   }

