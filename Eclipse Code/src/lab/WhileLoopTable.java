package lab;

public class WhileLoopTable {

	public static void main(String[] args) {
		
		int limitUno = 8;
		int limitDos = 4;
		int a = 0;
		int b = 0;
		
		while (a < limitUno) {
			a++;
			if (a <= 4) {
				System.out.println(1);
			}
			else {
				System.out.println(2);
			}
			while (b < limitDos) {
				b++;
				if (b <= 4) {
					System.out.print("	" + b);
				}
				else {
					System.out.print("	" + (b - 4));
				}
			
		}

	}
	}
}



