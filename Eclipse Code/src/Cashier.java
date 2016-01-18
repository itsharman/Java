
public class Cashier {
	
	private int change; // 0 - 100 in pennies

	public Cashier(int change) {
		this.change = change;
	}
	

	public int getChange() {
		return change;
	}

	public void setChange(int change) {
		this.change = change;
	}
	
//TODO: FINISH MY METHODS
	public int getPennies()
	{
		int total = change - getNickels()*5 - getDimes()*10 - getQuarters()*25;
		
		return total;
	}
	
	public int getNickels()
	{
		int total = change - getDimes()*10 - getQuarters()*25;
		
		return total/5;
	}
	
	public int getDimes()
	{
		int total = change - getQuarters()*25;
		
		return total/10;
	}
	
	public int getQuarters()
	{
		return change/25;
	}
}
