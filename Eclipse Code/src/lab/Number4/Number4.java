package lab.Number4;

import java.util.Scanner;

public class Number4 {

	public static void main(String[] args) {
		
		int randomNum;
		int v;
		int vCounter = 0;

		Scanner scan = new Scanner(System.in);
	    System.out.println("How many random numbers should be generated? ");
	    randomNum = scan.nextInt();
	    System.out.println("What is the number of values for each random draw? ");
	    v = scan.nextInt();
	    
	    int[] arr = new int[randomNum];
	    
	    for (int i = 0; i < arr.length; i++) {
	    	
	    	arr[i] = (int) (Math.random()*arr.length);

	    	for (int j = 0; j < v; j++) {
	    		
	    		v++;
	    		
	    	} 
	    	
	    	System.out.println(i + " " + arr[i]);
	    
	    	//v keeps track of where you're stop filling array 
	  
	    }
	    
	}

}
