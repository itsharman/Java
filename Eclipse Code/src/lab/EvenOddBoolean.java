package lab;
import java.util.Scanner;

public class EvenOddBoolean {

	public static void main(String[] args) {
		
		String state = "";
		int evenTally = 0;
		int oddTally = 0;

		for (int i = 0; i < 5; i++) {
			
			Scanner scan = new Scanner(System.in);
		    System.out.println("Enter a value:");
		    int x = scan.nextInt();
//		    System.out.println(x); I blocked this out because, although the instructions say to print x, the previous line already does that.
		    
		    if ((x/2)*2 == x) {
		    	if (x != 0) {
		    		//System.out.println("X " + "(" + x + ")" + " is even.")
		    		state = "even";
		    	}
		    	if (x == 0) {
		    		//System.out.println("X is zero, so neither even nor odd.");
		    		state = "neither";
		    	}	
		    }
		    
		    else {
	    		//System.out.println("X " + "(" + x + ")" + " is odd.");
		    	state = "odd";
	    	}
		    
		    if (state.equals("even")) {
		    	evenTally++;
		    }
		    
		    if (state.equals("odd")) {
		    	oddTally++;
		    }
			
		}
		
		System.out.println("Done");
		System.out.println("Amount of even numbers entered: " + evenTally);
		System.out.println("Amount of odd numbers entered: " + oddTally);
    	
	}

}
