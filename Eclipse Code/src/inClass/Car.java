package inClass;

public class Car {
	
	// DATA
	int gallonsLeft; //Is the tank full or empty (in gallons)?
	int capacity; //Does not change
	int mpg; //Does not change
	String brand;
	
	// CONSTRUCTOR -- just fills the data
	
	public Car() // default constructor -- it'll just give it values
	{
		gallonsLeft = 0;
		capacity = 13;
		mpg = 21;
		brand = "Toy Yoda";
	}
	
	public String toString() // this prints the data
	{
		return brand + " gallons: " + gallonsLeft;
	}

}
