
public class Number {

	private int number; // PIV
	
	
	public Number() //DEFAULT
	{
		setNumber(2);
	}
	
	public Number(int n) //OVERIDDEN
	{
		setNumber(n);
	}


	public int getNumber() {
		return number;
	}

	/**
	 * Sets number, but protects the value from being lower than 2
	 */
	public void setNumber(int number) {
		if(number > 1)
			this.number = number;
		else
			throw new IllegalArgumentException("\n\nThis number is too low to be tested.\n" +					
				"Harman was here\n");
	}
	
	/**
	 * @returns true if number <number> is prime
	 */
	public boolean isPrime()
	{
		for(int i = 2; i < Math.sqrt(number); i++)  // only need until sqrt of number
			if(number % i == 0)  // checking each number for divisibility
				return false;
		// if not divisible
		return true;
	}
	
	/*********************************
	 ** Created by Dr. Roman Usatin **
	 *********************************/
}
