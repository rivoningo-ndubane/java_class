// Rivoningo Ndubane
// 55829465

public class RectangularThing extends SquareThing
{
	private int width;
	
	public RectangularThing()
	{
		this("", 0, 0);
	}
	public RectangularThing(String color, int length, int width)
	{
		super(color, length);
		setWidth(width);
	}
	
	// SET METHODS
	public void setWidth(int width)
	{
		this.width = width;
	}
	
	// GET METHODS
	public int getWidth()
	{
		return this.width;
	}
	
	// COMPUTATION
	public String toString()
	{
		return super.toString() + "\nWidth: " + getWidth();
	}
}