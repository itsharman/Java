package Labs;

/**
A class to test the Door class.
*/

public class DoorTester
{
	public static void main(String[] args)
	
	{
		Door frontDoor = new Door("front", "open");
		System.out.println("The front door is " + frontDoor.getState());
		System.out.println("Expected:  open");
		
		Door backDoor = new Door("back", "closed");
		System.out.println("The back door is " + backDoor.getState());
		System.out.println("Expected:  closed"); 
		
		Door sideDoor = new Door("side", "closed");
		System.out.println("The side door is " + sideDoor.getState());
		System.out.println("Expected:  closed"); 
		
		backDoor.setState("open");
		System.out.println("The back door is " + backDoor.getState());
		System.out.println("Expected:  open");
		
		sideDoor.setName("side door");
		System.out.println("The side door is " + sideDoor.getName());
		System.out.println("Expected:  side door");
		
		sideDoor.setState("open");
		System.out.println("The side door is " + sideDoor.getState());
		System.out.println("Expected:  open");
	}
}
