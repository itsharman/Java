package labs;

public class DriversLicense extends Card {
	
	private int expirationYear;

	public DriversLicense(String n, int expiration) {
		super(n);//makes a card
		expirationYear = expiration;
	}

	public String format() {
		return format() + " expiration: " + expirationYear;
	}

}
