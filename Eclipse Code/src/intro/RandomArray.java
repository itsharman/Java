package intro;

import java.util.Random;

public class RandomArray {
	
//	static boolean consecutive = false;

	public static void main(String[] args) {
		
		Random r = new Random();
		
		int arr[] = new int[9];
		
		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = r.nextInt(9) + 1;
			
//			if (arr[i] == arr[i-1]) {
//				
//				consecutive = true;
//				
//			}
			
		}
		
		printArray(arr);
		if(twoSame(arr)) {
			System.out.println("\nTwo consecutive values are the same.");
		}
		else System.out.println("\nNo consecutive values are the same.");
		
//		System.out.println(consecutive);
		
	}

	private static boolean twoSame(int[] arr) {
		
		for (int i = 0; i < arr.length - 1; i++) {
			
			if (arr[i] == arr[i + 1])
				return true;
			
		}
		
		return false;
		
	}

	private static void printArray(int[] arr) {
		
		System.out.println("Array: ");
		for(int temp : arr) {
			
			System.out.print(temp + " ");
			
			
		}
		
		System.out.println();
		
	}

}
