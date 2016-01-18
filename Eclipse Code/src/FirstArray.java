
public class FirstArray {

	public static void main(String[] args) {
		
		int arr1[], b; //just arr1 is an array, b is an int
		int [] arr2, c; // both arr2 and c are arrays
		//int[] arr2;

		int[] grades = {77, 92, 100, 80}; // array size is 4, 77 is first element (zero), 80 is fourth element (three)
		System.out.println(grades[3]); //prints the first element from array
		
		//the 80 is actually 3 points more
		
		grades[3] += 3;
		
		System.out.println(grades[3]); 

		//arr2 has 100 elements/items
		
		arr2 = new int[100];
		arr2[40] = 60;
		arr2[82] = -64;
		arr2[3] = arr2[40] + 8;
		
		for (int i = 0; i < arr2.length; i++) //always start at 0, always end at blabla.length
			{
			
			System.out.println(i + ": " + arr2[i]);
		}
	}

}
