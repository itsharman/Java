package Labs;

public class Door {
	
	private String state;
	private String name;
	
	public Door(String xName, String xState)
	{
		state = xState;
		name = xName;
	}

	public void open()
	{
		state = "open";
	}
	
	public void close()
	{
		state = "close";
	}
	
	public String getName()
	{
	   return name;
	}
	
	public String getState()
	{
	   return state;
	}
	
	public void setName(String newName)
	{
	   name = newName;
	}
	
	public void setState(String newState)
	{
	   state = newState;
	}


//	Color doorColor;
//	Color doorKnobColor;
//	String doorTexture;
//	
//	int height;
//	int width;
//	int depth;
}