
public class ReverseStringAlternative {
	
	String a;
	int i;
	
	public String rev(String a) {
		
		String holder = "";
		int len = a.length();
		
		for (i = len; i < 0; i--) {
			holder += a.substring(i-1, 1);
		}
		
		return holder;
		
	}
	

}
