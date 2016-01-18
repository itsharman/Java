package intro;

public class ArrayGame {

	public static void main(String[] args) {

		int[] arr = {7, 6, 5, 4, 3, 2, 1};
		int j = arr.length - 1;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[j];
			j--;
			System.out.print(arr[i] + " ");
		}
		
		printArray(arr);

	}

	private static void printArray(int[] arr) {
		// to print the arrray forwards from o to length - 1
		
		System.out.println("\nArray: ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2 != 0) arr[i] = 100;
			arr[i] = arr[j];
			j--;
			System.out.print(arr[i] + " ");
		}
		
	}

}
