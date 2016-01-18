package lab;

import java.util.Scanner;

public class GaussForandDoLoop {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter a value for n:");
	    int n = scan.nextInt();
	    
	    int i = 0;
		int limit = n;
		
		do {
			i++;
			n += i;
			System.out.println(n - i);	
		}while (i < limit);
		
		for (i = 0; i <= limit; i++)
		   {
			n += i;
			System.out.println(n - i);
		   }

	}
}
