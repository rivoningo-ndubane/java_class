// Rivoningo Ndubane
// 55829465

public class Thing
{
	private String color;
	
	public Thing()
	{
		this("");
	}
	public Thing(String color)
	{
		setColor(color);
	}
	
	// SET METHODS
	public void setColor(String color)
	{
		this.color = color;
	}
	
	// GET METHODS
	public String getColor()
	{
		return this.color;
	}
	
	// COMPUTATION
	public String toString()
	{
		return "Color: " + getColor();
	}
	
	// MAIN
	public static void main(String args[])
	{
	}
}