package Labs;

public class PostcardPrinter
{
   public static void main(String[] args)
   {
	   
      Postcard postcard1 = new Postcard("Harman", "Sue");
      postcard1.print();
      
      Postcard postcard2 = new Postcard("Harman", "Tim");
      postcard2.print();
      
   } 
}