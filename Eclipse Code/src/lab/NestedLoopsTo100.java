package lab;

import java.util.Scanner;

public class NestedLoopsTo100 {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter a value for n:");
	    int n = scan.nextInt();
	    
	    int i = 0;
		int limit = n;
		while (i < limit)
		   {
			i++;
			n += i;
		}
		System.out.println("The sum of positive integers from 1 to " + i + " is " + (n-i) + ".");
	}
}