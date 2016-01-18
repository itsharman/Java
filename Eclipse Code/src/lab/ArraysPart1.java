package lab;

public class ArraysPart1 {

	public static void main(String[] args) {
		
		double x[] = {8, 4, 5, 21, 7, 9, 18, 2, 100};
		System.out.println(x.length);
		System.out.println(x[0]);
		System.out.println(x[x.length-1]);
		//e is the same thing as d because in both cases we are printing
		//the last element in the array
		
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		
		for (int i = 0; i < x.length; i++) {
			System.out.print("\n" + i + "th element: " + x[i]);
		}
		
		int j = x.length - 1;
		
		for (int i = 0; i < x.length; i++) {
			x[i] = x[j];
			j--;
			System.out.print("\n" + x[i] + " ");
		}
		
		for (double i : x) {
			System.out.print("\n" + i + " ");
		}
	}

}
