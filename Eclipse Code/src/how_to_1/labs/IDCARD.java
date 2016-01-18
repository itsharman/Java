package labs;

public class IDCARD extends Card {

	private int idNumber;
	//private int id;
	
//	public IDCARD(String name, int id) {
//		super(name); //makes a blank name card
//		id = -666;
//	}

	public IDCARD(String name, int id) {
		super(name); //makes a card
		idNumber = id;		
	}
	
	public String format() {
		return format() + " id number: " + idNumber;
	}

}
