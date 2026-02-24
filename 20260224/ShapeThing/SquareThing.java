// Rivoningo Ndubane
// 55829465

public class SquareThing
{
	private String color;
	private int length;
	
	public SquareThing()
	{
		this("", 0);
	}
	public SquareThing(String color, int length)
	{
		setColor(color);
		setLength(length);
	}
	
	// SET METHODS
	public void setColor(String color)
	{
		this.color = color;
	}
	public void setLength(int length)
	{
		this.length = length;
	}
	
	// GET METHODS
	public String getColor()
	{
		return this.color;
	}
	
	public int getLength()
	{
		return this.length;
	}
	
	// COMPUTATION
	public String toString()
	{
		return "Color: " + getColor() + "\nLength: " + getLength();
	}
	
	// MAIN
	public static void main(String args[])
	{
	}
}