package labs;

import java.util.Scanner;
public class RelationalOperators {

	static int x;
	static int y;
	static int z;

	public static void main(String[] args) {
		// ==, !=, <, >, <=, >=
		
		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter a value for x:");
	    x = scan.nextInt();
	    System.out.println("Enter a value for y:");
	    y = scan.nextInt();
		
		if (x > 0) {
			System.out.println("x is positive");
		}
		if (x <= 0) {
			System.out.println("x is zero or negative");
		}
		if (x >= 10) {
			System.out.println("x is at least 10");
		}
		if (x < 10) {
			System.out.println("x is less than 10");
		}
		if (x == 0 && y == 0) {
			System.out.println("x and y are both zero");
		}
		if (x/2 == z) {
			System.out.println("x is even");
		}
	}

}
