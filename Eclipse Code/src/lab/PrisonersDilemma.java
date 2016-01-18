package lab;
import javax.swing.JOptionPane;
public class PrisonersDilemma {

	static int myMoney = 0;
	static int partnerMoney = 0;
	
	public static void main(String[] args) {
		// 0 = cooperate
		// 1 = rat
		for(int i = 0; i < 10; i++)
		{
//			System.out.println("You have: " + me + " your partner has: " + other);
//			System.out.println("What are you gonna do? 0 = cooperate, 1 = rat");
			int choice = JOptionPane.showConfirmDialog(null,"You have: " + myMoney + 
										" your partner has: " + partnerMoney + 
										"\nAre you going to cooperate?");
//			int otherChoice = (int)(Math.random() * 2);
			int otherChoice = (int)(Math.random() * 4); //0, 1, 2, 3
			if (otherChoice >= 1) otherChoice = 1;
			
			determineMoney(choice, otherChoice);
		}

		JOptionPane.showMessageDialog(null, "Final results: \n" + 
										"You have: " + myMoney + 
										" your partner has: " + partnerMoney);
		
		
	}

	private static void determineMoney(int choice, int otherChoice) {
		if(choice == 0 && otherChoice == 0)
		{
			myMoney += 300;
			partnerMoney += 300;
			JOptionPane.showMessageDialog(null, "You both cooperated, +100");
		}
		else if(choice == 1 && otherChoice == 1)
		{
			myMoney -= 10;
			partnerMoney -= 10;
			JOptionPane.showMessageDialog(null, "You both ratted, -10");
		}
		else if(choice == 1 && otherChoice == 0)
		{
			myMoney += 500;
			partnerMoney -= 100;
			JOptionPane.showMessageDialog(null, "You ratted, and your partner cooperated +500");
		}
		else if(choice == 0 && otherChoice == 1)
		{
			myMoney -= 300;
			partnerMoney += 500;
			JOptionPane.showMessageDialog(null, "You cooperated, and your partner ratted -100");
		}
			
	}

}
