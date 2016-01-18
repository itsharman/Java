package Labs;

public class VendingMachine {
	
	private int cans;
	private int tokens;
    
//    public void initialize()
//    {
//    	cans = 0;
//    	tokens = 10;
//    }
//
//    public void fillUp()
//    {
//    	//this adds 10 cans to the vending machine
//    	cans = cans + 10;
//    }
//
//    public void addToken()
//    {
//    	tokens = tokens + 1;
//    	cans = cans - 1;
//    }
//
//    public int getTokenCount()
//    {
//    	return tokens;
//    }
//    
//    public int getCanCount()
//    {
//    	return cans;
//    }
	
	public void initialize()
    {
    	cans = 10;
    	tokens = 10;
    }

    public void fillUp(int cans)
    {
    	//this adds 10 cans to the vending machine
    	cans = cans + 10;
    }

    public void addToken()
    {
    	tokens = tokens + 1;
    	cans = cans - 1;
    }

    public int getTokenCount()
    {
    	return tokens;
    }
    
    public int getCanCount()
    {
    	return cans;
    }

}
