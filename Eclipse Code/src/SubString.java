
public class SubString {
	
	public static void main(String[] args) {


		String fullName1 = "Sofia de la Garza";
		String fullName = "Harman";
		String lastName = "Singh";
		String email = "@packer.edu";
		int spaceLoc = fullName.lastIndexOf(" ") + 1;
		
//		System.out.println(fullName.substring(spaceLoc));
//		System.out.println(fullName1.substring(7,12));
		System.out.println(getEmail(fullName, lastName, email));
		System.out.println(getEmailReal(getEmail(null, null, null)));

	}
	
	public static String getEmail(String fullName, String lastName, String email) {
		
		return fullName.substring(0,2) + lastName + email;
		
	}
	
	public static String getEmailReal(String getEmail) {
		return getEmail.toLowerCase();
	}

}
