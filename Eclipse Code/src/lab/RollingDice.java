package lab;

public class RollingDice {

	public static void main(String[] args) {
		
		int one = 0, two = 0, three = 0, four = 0, five = 0, six = 0, toss = 0;

		for (int i = 0; i < 1000; i++) {
			toss = (int)(Math.random()*6)+1;
			System.out.println(toss + ", ");
			if (toss == 1) one++;
			if (toss == 2) two++;
			if (toss == 3) three++;
			if (toss == 4) four++;
			if (toss == 5) five++;
			if (toss == 6) six++;
		}
		
		System.out.println("We had " + one + " 1s."); System.out.println("We had " + two + " 2s.");
		System.out.println("We had " + three + " 3s.");	System.out.println("We had " + four + " 4s.");
		System.out.println("We had " + five + " 5s."); System.out.println("We had " + six + " 6s.");
		
//		int toss = 0;
//		
//		while (toss != 5) {
//			toss = (int)(Math.random()*6)+1;
//			System.out.print(toss + ", ");
//		}
		
	}
}
	

