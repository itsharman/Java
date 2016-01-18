package lab;

import java.util.Scanner;

public class TakeTheBus {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	    System.out.println("What time is it?");
	    int time = scan.nextInt();
	    System.out.println("What is the temperature?");
	    int temp = scan.nextInt();

	    if (time < 10) {
	    	System.out.println("Take the taxi.");
	    }
	    if (time >= 10) {
	    	if (temp > 80) {
	    		System.out.println("Take the bus.");
	    	}
	    	else if (temp < 40) {
	    		System.out.println("Take the subway.");
	    	}
	    	else {
	    		if (time > 30) {
	    			System.out.println("Walk, you good-for-nothing imbecile!");	
	    		}	 
	    	  } 	  		
	    	}
	    }
}


