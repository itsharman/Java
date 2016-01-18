package testPrep;

public class Point {
	
	private int x;
	private int y;
	
	public Point(int x1, int y1)
	{
		x = x1;
		y = y1;
	}
	
	public void setPoint(int num1, int num2)
	{
		x = num1;
		y = num2; 
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public double getDistanceFromOrigin()
	{
		return Math.sqrt(getX()*getX() + getY()*getY());		
	}
	
//	public double howFar(Point other)
//	{
//		int otherx = other.getX();
//		int othery = other.getY();
//		return Math.sqrt((x - otherx)*(x - otherx) + (y - othery)*(y - othery));
//	}

}
