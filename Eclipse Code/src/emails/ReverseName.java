package emails;

import javax.swing.JOptionPane;

public class ReverseName {

	public static void main(String[] args) {

		int counter = 0;
		String name = "";
		while(true)
		{
			name = JOptionPane.showInputDialog("Hi! What's your name?");
			
			String reversed = reversed(name);
			
			if(name.equalsIgnoreCase("Hage"))
			{
				JOptionPane.showMessageDialog(null, "NO! YOU CANNOT USE THIS PROGRAM!");
				counter++;
			}
			else
				JOptionPane.showMessageDialog(null, reversed + " is a silly name");
			
			if( counter > 5)
				break;
		}
		
		
	}

	private static String reversed(String name) {
		// ROMAN
		
		String reverse = "";
		
		for(int i = name.length(); i > 0; i--)
		{
			reverse = reverse + name.substring(i-1, i);
			//System.out.println(reverse);
		}
		
		return reverse;
	}

}