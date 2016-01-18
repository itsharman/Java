package labs;

public class CallingCard extends Card {

	private int cardNumber;
	private int PIN;
	
	public CallingCard() {
		// TODO Auto-generated constructor stub
	}

//	public CallingCard(String n) {
//		super(n);
//		// TODO Auto-generated constructor stub
//	}
	
	public CallingCard(String name, int cardNumber, int pin) {
		super(name);
		this.cardNumber = cardNumber;
		PIN = pin;
		// TODO Auto-generated constructor stub
	}


}
