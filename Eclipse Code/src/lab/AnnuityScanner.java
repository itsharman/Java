package lab;

import java.util.Scanner;

public class AnnuityScanner {
	
	static double PVann;
	static double PMT;
	static double i;
	static double n;
	
	public static void main(String[] args) {
		
		do
		{
	    	@SuppressWarnings("resource")
			Scanner input = new Scanner (System.in);
	    	
	    	System.out.print("Enter the periodic payment (dollars): ");
	        PMT = input.nextDouble();

	        System.out.print ("Enter the periodic interest (decimal): ");
	        i = input.nextDouble();
	    	
	        System.out.print ("Enter the number of payments: ");
	        n = input.nextDouble();
	    	
	    	PVann = PMT * ((Math.pow((1 + i), n) - 1 - 1) / i) / Math.pow((1 + i), n) - 1 + 1;
	    	
	    	System.out.println(PVann);
	  
		}
		
		while(PMT > 0);
		
	}

}