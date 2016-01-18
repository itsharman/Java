import java.util.Scanner;

public class Supermarket {

	public static void main(String[] args) {
		
		int value;
		
		do
		{
			Scanner input = new Scanner (System.in);
			value = input.nextInt();
			Cashier c = new Cashier(value);
				
			System.out.println("Total: " + c.getChange());
			System.out.print(" Quarters: " + c.getQuarters());
			System.out.print(" Dimes: " + c.getDimes());
			System.out.print(" Nickels: " + c.getNickels());
			System.out.println(" Pennies: " + c.getPennies());
		}
		
		while(value > 0);
	
	}

}
