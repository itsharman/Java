import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class GuessThisStudent { 
	public static int MAX_NUM = 20;

	public static void main(String[] args) {

		int play = JOptionPane.showConfirmDialog(null,"Would you like to play a game?");
		// returns 2 for cancel, 1 for no, and 0 for yes
		if(play == 0)
		{
			play();
		}
		else if(play == 1)
		{
			JOptionPane.showMessageDialog(null,  "That's ok...");
			ImageIcon icon = new ImageIcon("cat.png");
		}
		else
		{
			JOptionPane.showMessageDialog(null,  "Screw you, buddy!");
		}
		
	}

	private static void play() {
		
		String name = JOptionPane.showInputDialog("What's your name?");
		JOptionPane.showMessageDialog(null,  "Welcome, " + name + "." +
				"\nWe're going to play a guessing game. " +
				"\nThink of a number from 1 to " + MAX_NUM);
		
		/// Setting up all of the vars
		
		int guess = MAX_NUM / 2;
		int high = MAX_NUM;
		int low = 1;
		int guessCount = 0;
		boolean higher = true;
		
		String answer = JOptionPane.showInputDialog("Is it " + guess + "?");
		while(answer.equalsIgnoreCase("no"))
		{
			String hilo = JOptionPane.showInputDialog("Is it higher or lower than " + guess + "?");
			if(hilo.equalsIgnoreCase("higher"))
			{
				low = guess + 1;
			}
			else
			{
				high = guess - 1;
			}
			guess = (low + high)/2;
			
			answer = JOptionPane.showInputDialog("Is it " + guess + "?");
			guessCount++;
		}

		answer = JOptionPane.showInputDialog("It took me " + (guessCount + 1) + 
				" tries to guess the number " + guess + ".");
	}

}
