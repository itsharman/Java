import java.util.Scanner;

public class essayDeterminer1 {

	public static void main(String[] args) {
		
		int value = 0;
		
		do
		{
			System.out.println("Enter your email address:");
			Scanner input = new Scanner (System.in);
			String email = input.nextLine();
			String verifier = ".";
			
			System.out.println(email.charAt(14));
			System.out.println(email.length());
//			I'm not sure why it isn't working...
			
			if (email.substring(email.length()-4) == verifier) {
				
				System.out.println("Your email is valid.");
				
			}
			
			else {
				System.out.println("Your email is invalid.");
			}
		}
		
		while(value >= 0);
		
	}
	
}
