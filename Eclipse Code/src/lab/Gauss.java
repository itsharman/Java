package lab;

import java.util.Scanner;

public class Gauss {
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
		
		System.out.println(n - i);

	}
}

//public class Gauss {
//	public static void main(String[] args)
//	{
//		int i = 0;
//		int limit = 100;
//		int total = 0;
//		while (i < limit)
//		   {
//			i++;
//			total += i;
//			System.out.println(total);
//		   }
//	}
//}
