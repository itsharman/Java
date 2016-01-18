package cards;

public class Casino {

	public static void main(String[] args) {

		Card hand[] = new Card[5];
		
		hand[0] = new Card(2, 10);
		hand[1] = new Card(1, 9);
		hand[2] = new Card(1, 5);
		hand[3] = new Card(0, 1);
		hand[4] = new Card(3, 1);
		
		//if I comment any of these out, they will print null -- not empty, just doesn't exist -- literally nothing (space available, but nothing in space)
		//null -- bank account of $0 vs. not having a bank account
		
		for (int i = 0; i < hand.length; i++) {
			System.out.println("Card " + i + " = " + hand[i]); // hand[i] stands for hand sub i (substring)
		}
		
//		for (Card card : hand) {
//			System.out.println("Card " + card);
//		}


	}

}
