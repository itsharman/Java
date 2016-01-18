package labs;

import javax.swing.JOptionPane;

public class ComparingStrings2 {

	public static void main(String[] args) {
		
		String str1 = JOptionPane.showInputDialog("Enter your first word.");
		String str2 = JOptionPane.showInputDialog("Enter your second word.");
		String str3 = JOptionPane.showInputDialog("Enter your last word.");
		
		int result1 = str1.compareTo(str2);
		int result2 = str1.compareTo(str3);
		int result3 = str2.compareTo(str3);

	    String comparison = null;
	    
	    if (result1 < 0 && result3 < 0) {
	    		comparison = str2;
	    		JOptionPane.showConfirmDialog(null, comparison + "?");
	    	}
	    else if (result1 < 0 && result2 > 0) {
	    		comparison = str1;
	    		JOptionPane.showConfirmDialog(null, comparison + "?");
	        }
	   else {
	    		comparison = str3;
	    		JOptionPane.showConfirmDialog(null, comparison + "?");
	    	}
	    
	    }
	      
}

