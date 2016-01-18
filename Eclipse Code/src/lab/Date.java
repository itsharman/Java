package lab;

import java.util.Scanner;

public class Date {

	public static void main(String[] args) {
		int month;
		int day;

		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter a value for the month (1-12):");
	    month = scan.nextInt();
	    System.out.println("Enter a value for the day (1-31*):");
	    day = scan.nextInt();

	    	if (month >= 4 && month <= 6 && day >= 1 && day <= 31) {
				System.out.println("The date is in the second quarter of the year.");
			}
			  	
			if ((month == 2 && day == 28) || (month == 4 && day == 30) || (month == 6 && day == 30) || (month == 9 && day == 30) || (month == 11 && day == 30)) {
				System.out.println("The date is the last day of the month.");
			}
			
			else if (day == 31) {
				System.out.println("The date is the last day of the month.");
			}
				
			if (month <= 4) {
				
				if (month == 4 && day <= 15) {
					System.out.println("The date is before April 15.");
				}
				else {
					System.out.println("The date is before April 15.");
				}
				
			}

	}

}
