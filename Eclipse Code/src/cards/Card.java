package cards;

public class Card {
	
	private int suit;
	private int value;
	
	public Card (int s, int v) {
		suit = s;
		value = v;
	}
	
	public String toString(){
		String card = "";
		return suit + " " + value;
	}

}
