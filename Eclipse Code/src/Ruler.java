public class Ruler {

	public static void main(String[] args) {
		
		int end = 205;
		int feet = 0;
		int inches = 0;
		
		for (int i = 0; i < end; i++) {
			
			feet = i/12;
			inches = i%12;
			
			if (feet == 1) {
				
				if (inches == 1) {
					
					System.out.println(feet + " foot " + inches + " inch");
					
				}
				
				else {
					
					System.out.println(feet + " foot " + inches + " inches");
					
				}
				
			}
			
			else if (feet < 1) {
				
				if (inches == 1) {
					
					System.out.println(inches + " inch");
					
				}
				
				else {
					
					System.out.println(inches + " inches");
					
				}
				
			}
			
			else {
				
				if (inches == 1) {
					
					System.out.println(feet + " feet " + inches + " inch");		
					
				}
				
				else {
					
					System.out.println(feet + " feet " + inches + " inches");	
					
				}
					
			}
						
		}

	}

}
