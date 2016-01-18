package emails;

import javax.swing.JOptionPane;

public class MadLibs {

	public static void main(String[] args) {
		
		String word1 = JOptionPane.showInputDialog("Hi! Please enter a living thing.");
		String word2 = JOptionPane.showInputDialog("Now, please enter a place.");
		String word3 = JOptionPane.showInputDialog("Now, please enter a verb.");
		String word4 = JOptionPane.showInputDialog("Now, please enter an item.");
		String word5 = JOptionPane.showInputDialog("Now, please enter a living thing.");
		
		JOptionPane.showMessageDialog(null, "The " + word1.toLowerCase() + " went to the " + word2.toLowerCase() + " to " + 
		word3.toLowerCase() + " a " + word4.toLowerCase() + " for his " + word5.toLowerCase() + ". \nHow fantastic!"+ "\nThanks for playing!");

	}

}
