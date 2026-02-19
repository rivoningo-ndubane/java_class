// Rivoningo Ndubane
// 55829465

public class RoundThing
{
	private String color;
	private int radius;
	
	public RoundThing()
	{
		this("Blue", 4);
	}
	public RoundThing(String color, int radius)
	{
		setColor(color);
		setRadius(radius);
	}
	
	// SET METHODS
	public void setColor(String color)
	{
		this.color = color;
	}
	public void setRadius(int radius)
	{
		this.radius = radius;
	}
	
	// GET METHODS
	public String getColor()
	{
		return this.color;
	}
	
	public int getRadius()
	{
		return this.radius;
	}
	
	// COMPUTATION
	public String toString()
	{
		return "Color: " + getColor() + "\nRadius: " + getRadius();
	}
	
	// MAIN
	public static void main(String args[])
	{
	}
}