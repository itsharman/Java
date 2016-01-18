package lab;


public class DistanceConverter
{
	static double yards; 
	static double feet;
	static double inches;
	
   public static void main(String[] args)
   
   {
	   
      yards = 4;
      feet = yards * 3;
      inches = feet * 12;
      
      System.out.println(yards + " yards are " + feet + " feet");
      System.out.println(yards + " yards are " + inches + " inches");
      
   }
   
}