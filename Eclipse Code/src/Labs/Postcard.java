package Labs;

public class Postcard
{
	private String sender;
	private String recipient;
	
public Postcard(String aSender, String aRecipient)
   {
      sender = aSender; 
      recipient = aRecipient;
   }
    
   void sender(String sender)
   {
	  sender = "Harman";
   }
   
   void recipient(String recipient)
   {
	  recipient = "";
   }
   
   void print()
   {
	 System.out.println("Dear " + recipient + ": I am having a great time on");
	 System.out.println("the island of Java. The weather");
	 System.out.println("is great. Wish you were here!");
	 System.out.println("Love,");
	 System.out.println(sender);
   }

}


