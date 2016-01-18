package labs;

import java.util.Scanner;

public class OperatorsPractice1 {

	public static void main(String[] args) {
		
		int x;
		int y;
		int value = 0;
		
		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter a value for x:");
	    x = scan.nextInt();
	    System.out.println("Enter a value for y:");
	    y = scan.nextInt();
		
    	
	    	if (x > 0 && y > 0) {
				System.out.println("x and y are both positive");
			}
			
			else if (x < 0 && y < 0) {
				System.out.println("x and y are both negative");
			}
			
			else
			{
				System.out.println("Too bad.");
			}
		
	}

}
