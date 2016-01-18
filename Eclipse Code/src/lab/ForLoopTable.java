package lab;

public class ForLoopTable {

	public static void main(String[] args) {
		
		for (int a = 1; a <= 8; a++) {
			
			if (a <= 4) {
				System.out.println(1);
			}
			else {
				System.out.println(2);
			}
				
		}
		
		for (int b = 1; b <= 4; b++) {
			
			if (b <= 4) {
				System.out.print("	" + b);
			}
			else {
				System.out.print("	" + (b - 4));
			}
				
		}

	}

}
