// Rivoningo Ndubane
// 55829465

public class SquareThing extends Thing
{
	private int length;
	
	public SquareThing()
	{
		this("", 0);
	}
	public SquareThing(String color, int length)
	{
		super(color);
		setLength(length);
	}
	
	// SET METHODS
	public void setLength(int length)
	{
		this.length = length;
	}
	
	// GET METHODS
	public int getLength()
	{
		return this.length;
	}
	
	// COMPUTATION
	public String toString()
	{
		return super.toString() + "\nLength: " + getLength();
	}
}