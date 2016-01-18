import java.util.Random;
public class RandomInt {

	public static void main(String[] args) {
		
//		String alphabet = "dshc";
//		int n = alphabet.length();
//		Random r = new Random();
		
		Random generator = new Random(); 
		int i = generator.nextInt(10) + 2;
		System.out.println(i);

	}

}
