package lab;

public class SubString {
	
	static String input;
	static String output;

	public static void main(String[] args) {
		
		input = "The quick brown fox jumps over the lazy dog";
		System.out.println(input);
		
		output = input.substring(0, 1) + input.substring(2, 3) + input.substring(22, 23)
		+ input.substring(23, 24) + input.substring(5, 6) + input.substring(24, 25) + " " 
		+ input.substring(16, 17) + input.substring(5, 6) + input.substring(42, 43)
		+ input.substring(6, 7) + input.substring(31, 32);
		System.out.println(output);

	}

}
