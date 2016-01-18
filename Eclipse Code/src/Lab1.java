
public class Lab1 {
	
	public static void main(String args[]) {
		
		String greeting = "This is a Test";
		int n = greeting.length();
		
		//String is a class, greeting is a object
		
		//System.out.println(greeting.charAt(6)); //prints the nth character
		//System.out.println(greeting.isEmpty()); //true if its empty, false if its not
		//System.out.println(greeting.substring(4,17)); //prints the 4th character to 17th character
		//System.out.println(greeting.toUpperCase()); //makes all letters uppercase
		//System.out.println(greeting.toLowerCase()); //makes all letters lowercase
		//System.out.println(n);
		
		String newGreeting = greeting.toLowerCase();
		
		System.out.println(newGreeting);
		
		String bigTestString = newGreeting.toUpperCase(); 
		System.out.println(bigTestString);
		
		//Class vs. Object
		////System.out ==> object
		////println =====> method
		////objects are in the class (one class, but many objects)
		////OBJECT = entity (instance), CLASS = blueprint
		////Apartments look similar b/c of blueprint, but they're not the same b/c of instances
		//Reference vs. Value?
		
		//String is a reference type (references to something more complicated), a number is a primitive type
		//primitive types -- int, double, boolean (& float, long, char)
		//ie: System.out.println("Hi".gives u random stuff)
		//ie: System.out.println(6.doesn't give u anything)
		//Integer is different from int -- Integer makes anything into a reference, int makes anything into a primitive?
		
		//public boolean isSame (int num1, int num2)
				
		//boolean is the return type/value
		//isSame is the identifier (name)
		//(int num1, int num2) are the parameters

	}

}
