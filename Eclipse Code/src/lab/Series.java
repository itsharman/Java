package lab;

import java.util.Scanner;

public class Series {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter a value for n:");
	    int n = scan.nextInt();
	    
	    int i = 0;
		int limit = n;
		int checker = (n*(n+1))/2;
		while (i < limit)
		   {
			i++;
			n += i;	
		}
		System.out.println("The sum of positive integers from 1 to " + i + " is " + (n-i) + ".");
		if (checker == n-i) System.out.println("OK, this works.");
		else System.out.println("ERROR");
	}
}