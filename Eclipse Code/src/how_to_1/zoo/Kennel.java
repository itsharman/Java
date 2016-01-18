package zoo;

public class Kennel {

	public static void main(String[] args) {
		System.out.println("Regular dog: ");
		Dog rex = new Dog();
		rex.speak();
		
		System.out.println("\nBig dog: ");
		BigDog bubba = new BigDog(); 
		bubba.speak();

	}

}
