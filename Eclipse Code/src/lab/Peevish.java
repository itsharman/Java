package lab;

public class Peevish
{
   public static void main(String[] args)
   {
      boolean[] door;
      final int NODOORS = 101;    // We will not use door[0]
      final boolean OPEN = true;
      final boolean CLOSED = false;
      // Initialize the doors
      door = new boolean[NODOORS];
      for (int i = 0;  i < NODOORS; i++)
      {
         door[i] = CLOSED;
      }

      for (int i = 1; i < 100; i++) { 
    		for(int j = i; j < 100; j+=i) 
    		{
    	    	  	if(door[j] == OPEN)
    	    	  		door[j] = CLOSED;
    	    	  	else door[j] = OPEN;  	
    		}
    		if (door[i] == true)
            {
               System.out.println("Door " + i + " is open.");
            }
            else
            {
               System.out.println("Door " + i + " is closed.");
            }
      }     
   }
}

