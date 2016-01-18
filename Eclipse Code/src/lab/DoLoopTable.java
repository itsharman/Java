package lab;

public class DoLoopTable {

	public static void main(String[] args) {
		
		int limitUno = 8;
		int limitDos = 4;
		int a = 0;
		int b = 0;
		
		do {
			a++;
			if (a <= 4) {
				System.out.println(1);
			}
			else {
				System.out.println(2);
			}
		} while (a < limitUno);
		
		do {
			b++;
			if (b <= 4) {
				System.out.print("	" + b);
			}
			else {
				System.out.print("	" + (b - 4));
			}
			
		} while (b < limitDos);
		
	}

}


