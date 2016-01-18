package lab;

import java.util.Scanner;

public class BiggestInteger {

	public static void main(String[] args) {
		
		int value = 1;
		     
        do
		{
        	
        	@SuppressWarnings("resource")
    		Scanner input = new Scanner (System.in);
            
            System.out.print("Enter the first integer: ");
            int num1 = input.nextInt();

            System.out.print ("Enter the first integer: ");
            int num2 = input.nextInt();
            
            System.out.println(Math.min(num1, num2));
      
		}
		
		while(value > 0);

	}

}
