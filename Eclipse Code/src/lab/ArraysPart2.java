package lab;

import java.util.Arrays;

public class ArraysPart2 {

	public static void main(String[] args) {
		
		double x[] = {8, 4, 5, 21, 7, 9, 18, 2, 100};
		
		double count = 0; 
		double minimum = 0;
		
//		for (double i : x) {
//			count += i;
//		} System.out.println(count);
		
		for (int i = 0; i < x.length; i++) {
			count += x[i];
		} 
		
		System.out.println(count);
		
		Arrays.sort(x);
		
		System.out.println("The minimum value is " + x[0]);
		System.out.println("The maximum value is " + x[x.length - 1]);

	}

}
