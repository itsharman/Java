package lab;

import java.util.Scanner;


public class CustomerLister {

	public static void main(String[] args) {
		
		String customerLister[] = {"Cathy", "Ben", "Jorge", "Wanda", "Freddie"};
		double[] customerBalance = new double[5];
		Scanner input = new Scanner (System.in);
		
		for (int i = 0; i < customerLister.length; i++) {		
			System.out.println("\nEnter a balance for " + customerLister[i] + ": ");
			customerBalance[i] = input.nextDouble();
		}
		
		for (int i = 0; i < customerLister.length; i++) {		
			System.out.print("\n" + customerLister[i] + " has $" + customerBalance[i] + " in the bank account.");
		}
		
//		for (String i : customerLister) {
//			System.out.print(i + " ");
//		}

	}

}
