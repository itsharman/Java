public class NumberCubes {

	public static void main(String[] args) {
		
		NumberCube cube = new NumberCube();
		
//		int len = 40;
//		int[] tosses = new int[len];
//		for (int i = 0; i < tosses.length; i++) {
//			tosses[i] = cube.toss();
//		}
//		for (int i = 0; i < tosses.length; i++) {
//			System.out.println(i + ": " + tosses[i]);
//		}
//		
//		int currStreak = 0;
//		int longestStreak = 0;
//		int index = 0;
//		for (int i = 0; i < tosses.length; i++) {
//			if (tosses[i] == tosses[i+1]) {
//				currStreak++;
//				if (currStreak > longestStreak) {
//					longestStreak = currStreak;
//					index = i - longestStreak + 1;
//				}
//			}
//			else currStreak = 0;
//		}
//		System.out.println("The longest streak is located: " + index);
	
		int[] x = {1,2,3,2,6,4,4,5,3,3,3,2,6,5,8,8,8,8,8};
		int[] y = {1,2,8,8,3,2,6,4,4,5,3,3,3,2,6,5,8,8};
		System.out.print("Cube toss output: " + cube.toss() + "\t");
		
//		for (int i = 0; i < values.length; i++) {
//			
//		}
		System.out.println("Cube tosses: " + cube.getCubeTosses(cube, 8).toString() + "\n");
		
		System.out.println("Longest run of x (index starting position): " + cube.getLongestRun(x));
		System.out.print("X: [");
		for(int i = 0; i < x.length; i++){  
			System.out.print(x[i] + ", "); 
		}System.out.print("]"); 
		
		System.out.println("\nLongest run of y (index starting position): " + cube.getLongestRun(y));
		System.out.print("Y: [");
		for(int i = 0; i < y.length; i++){  
			System.out.print(y[i] + ", "); 
		}System.out.print("]"); 
	}

}
