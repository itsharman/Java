public class Nursery {

	public static void main(String args[])
	{
		Baby baby1 = new Baby("Hage");
		Baby baby2 = new Baby("Kenya");
		
		System.out.println("Before murder:");
		System.out.println("baby 1: " + baby1.getName() + " location: " + baby1);
		System.out.println("baby 2: " + baby2.getName() + " location: " + baby2);
		
		baby1 = baby2; //Murdered Baby 1
		
		baby2.setName("Chameleon");
		baby1.setName("Lisa");

		System.out.println("After murder:");
		System.out.println("baby 1: " + baby1.getName() + " location: " + baby1);
		System.out.println("baby 2: " + baby2.getName() + " location: " + baby2);
		
		//location is a reference (link to somewhere in the memory), a number is a value; 
	}
	
}
