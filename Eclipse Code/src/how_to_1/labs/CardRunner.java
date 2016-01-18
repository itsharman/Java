package labs;

public class CardRunner {

	public static void main(String[] args) {

		Card c = new Card("Harman Singh");
		
		System.out.println(c.format());
		
		IDCARD i = new IDCARD("Bob Dole", 888);
		
		System.out.println(i.format());

	}

}
