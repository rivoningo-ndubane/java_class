// Rivoningo Ndubane
// 55829465

public class RoundThing extends Thing
{
	private int radius;
	
	public RoundThing()
	{
		this("", 0);
	}
	public RoundThing(String color, int radius)
	{
		super(color);
		setRadius(radius);
	}
	
	// SET METHODS
	public void setRadius(int radius)
	{
		this.radius = radius;
	}
	
	// GET METHODS
	public int getRadius()
	{
		return this.radius;
	}
	
	// COMPUTATION
	public String toString()
	{
		return super.toString() + "\nRadius: " + getRadius();
	}
}