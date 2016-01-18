package labs;

public class RelatingStrings {

	public static void main(String[] args) {
		
		String word1 = "catalog";
		String word2 = "cat";
		
		int result = word1.compareTo("aaa");
		int result2 = word1.compareTo(word2);

	    String comparison;
	    if (result < 0) 
	      {
	        comparison = "comes before";
	     	System.out.println(comparison);
	      }
	
	    else
	    {
	    	comparison = "comes after";
	    	System.out.println(comparison);
	    }
	    if (result2 < 0)
	    {
	    	comparison = "they are equal";
	    	System.out.println(comparison);
	    }
	    //I don't really understand how this works.
	}

}
