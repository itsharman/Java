package lab;

public class ArrayRotation
{
   public static void main(String[] args)
   {
	  double[] x = {8, 4, 5, 21, 7, 9, 18, 2, 100};
      System.out.println("Before rotation:  ==============================");
      for (int i = 0; i < x.length; i++)
      {  
         System.out.println("x[" + i + "]:  " + x[i]);
      }
    
      System.out.println("After rotation:  ==============================");       
      for (int i = 0; i < x.length - 1; i++)
      { 
    	 x[i] = x[i+1];
         System.out.println("x[" + i + "]:  " + x[i]);
         //I don't know how to fix this -- I lose the last element. I tried fixing it but it messes up my program. 
      } 
          
   }
 
}


