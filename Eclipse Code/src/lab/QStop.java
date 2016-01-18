package lab;

import java.util.Scanner;

public class QStop {

	public static void main(String[] args) {
		int value = 0;
		int tally = 0;
		int howManyTimes = 0;
		do {
			Scanner scan = new Scanner(System.in);
		    System.out.println("Enter any value:");
		    int n = scan.nextInt();
		    System.out.println("Continue (c) or quit(q)?");
		    String checker = scan.next();
		    howManyTimes ++;
		    tally += n;
		    
		    if(checker.equals("q"))
			   {
				System.out.println("Times inputted:" + howManyTimes);
				System.out.println("Grand total:" + tally);
			   }
		} while (value == 0);
	}
}
